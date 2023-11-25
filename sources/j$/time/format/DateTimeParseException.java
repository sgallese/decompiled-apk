package j$.time.format;

import j$.time.DateTimeException;

/* loaded from: classes2.dex */
public class DateTimeParseException extends DateTimeException {
    private static final long serialVersionUID = 4304633501674722597L;
    private final int errorIndex;
    private final String parsedString;

    public DateTimeParseException(String str, CharSequence charSequence, int i10) {
        super(str);
        this.parsedString = charSequence.toString();
        this.errorIndex = i10;
    }

    public DateTimeParseException(String str, CharSequence charSequence, int i10, Throwable th) {
        super(str, th);
        this.parsedString = charSequence.toString();
        this.errorIndex = i10;
    }
}
