package jp.ne.yonem.pattern.Composite.Sample;

public class FileTreatmentException extends RuntimeException {      // RuntimeExceptionで正しいか？

    public FileTreatmentException() {
    }

    public FileTreatmentException(String msg) {
        super(msg);
    }
}
