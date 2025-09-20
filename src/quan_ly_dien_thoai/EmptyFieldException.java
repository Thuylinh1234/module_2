package quan_ly_dien_thoai;

public class EmptyFieldException extends Exception {
    public EmptyFieldException(String message) {
        super(message);
    }
}

// c. Pin ngoài 0 - 100
class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

// d. Mô tả quá ngắn
class MinLengthException extends Exception {
    public MinLengthException(String message) {
        super(message);
    }
}

// e. Số âm
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
