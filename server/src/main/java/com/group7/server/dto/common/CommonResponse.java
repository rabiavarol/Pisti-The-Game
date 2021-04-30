package com.group7.server.dto.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.group7.server.definitions.common.StatusCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotEmpty;

/** DTO used as a super class for all responses*/
@Data
@NoArgsConstructor
public class CommonResponse {
    /** Indicates the success of the requested operation*/
    @NotEmpty
    private StatusCode statusCode;

    /** Indicates the error that occurred, null if operation was successful.*/
    @Nullable
    private String errorMessage;

    @JsonCreator
    public CommonResponse(@JsonProperty("statusCode") StatusCode statusCode,
                          @JsonProperty("errorMessage") String errorMessage){
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
    }
}
