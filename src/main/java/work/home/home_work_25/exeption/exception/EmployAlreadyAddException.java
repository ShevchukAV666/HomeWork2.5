package work.home.home_work_25.exeption.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployAlreadyAddException extends RuntimeException {

    public EmployAlreadyAddException() {
    }

    public EmployAlreadyAddException(String message) {
        super(message);
    }

    public EmployAlreadyAddException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployAlreadyAddException(Throwable cause) {
        super(cause);
    }

    public EmployAlreadyAddException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
