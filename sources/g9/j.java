package g9;

/* compiled from: HeartBeatInfo.java */
/* loaded from: classes3.dex */
public interface j {

    /* compiled from: HeartBeatInfo.java */
    /* loaded from: classes3.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        a(int i10) {
            this.code = i10;
        }

        public int getCode() {
            return this.code;
        }
    }

    a b(String str);
}
