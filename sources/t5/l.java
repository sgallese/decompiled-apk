package t5;

import androidx.recyclerview.widget.m;

/* compiled from: HttpClient.kt */
/* loaded from: classes.dex */
public enum l {
    SUCCESS(m.e.DEFAULT_DRAG_ANIMATION_DURATION),
    BAD_REQUEST(400),
    TIMEOUT(408),
    PAYLOAD_TOO_LARGE(413),
    TOO_MANY_REQUESTS(429),
    FAILED(500);

    private final int code;

    l(int i10) {
        this.code = i10;
    }

    public final int getCode() {
        return this.code;
    }
}
