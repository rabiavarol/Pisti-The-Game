package com.group7.client.controller;

import com.group7.client.controller.common.BaseNetworkController;
import com.group7.client.definitions.common.StatusCode;
import com.group7.client.definitions.network.NetworkManager;
import com.group7.client.definitions.screen.ScreenManager;
import com.group7.client.dto.authentication.AuthResponse;
import com.group7.client.dto.authentication.ForgotPasswordRequest;
import com.group7.client.dto.common.CommonResponse;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

/** Controller for the reset password form*/
@Component
public class ResetPasswordController extends BaseNetworkController {
    /** Common api address of the back-end for controller requests*/
    @Value("${spring.application.apiAddress.player}") private String mApiAddress;

    @FXML
    private TextField email_field;

    /** Setter injection method*/
    @Autowired
    public void setManagers(@Lazy ScreenManager screenManager, NetworkManager networkManager) {
        this.mScreenManager = screenManager;
        this.mNetworkManager = networkManager;
    }

    /** Returns to the main screen*/
    @FXML
    private void clickReturnButton() {
        mScreenManager.activatePane("main_menu", null);
    }

    /** Sends the email as a reset password request*/
    @FXML
    public void clickResetPasswordButton() {
        String email = email_field.getText();

        // Check validity of fields
        if(!areFieldsValid(email)) {
            displayError("Reset Password",
                    "Some fields are missing.");
            return;
        }

        // Exchange request and response
        ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest(email);
        CommonResponse[] commonResponse = new AuthResponse[1];

        StatusCode networkStatusCode = mNetworkManager.exchange(
                mApiAddress + "/forgotPassword",
                HttpMethod.POST,
                forgotPasswordRequest,
                commonResponse,
                AuthResponse.class);

        // Check if operation is successful
        if(isOperationSuccess(commonResponse[0], networkStatusCode, AuthResponse.class, "Reset Password")) {
            AuthResponse resetPasswordResponse = (AuthResponse) commonResponse[0];
            displaySuccess("Reset Password", "Please check your email!");
            mScreenManager.activatePane("main_menu", null);
        }
        clearFields();
    }

    /** Clears all the fields*/
    private void clearFields() {
        email_field.clear();
    }

    /** Check whether inputs are valid*/
    private boolean areFieldsValid(String email) {
        return !email.isEmpty();
    }
}
