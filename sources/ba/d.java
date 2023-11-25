package ba;

import com.google.protobuf.z;

/* compiled from: ApplicationProcessState.java */
/* loaded from: classes3.dex */
public enum d implements z.c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final z.d<d> internalValueMap = new z.d<d>() { // from class: ba.d.a
        @Override // com.google.protobuf.z.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public d a(int i10) {
            return d.forNumber(i10);
        }
    };
    private final int value;

    /* compiled from: ApplicationProcessState.java */
    /* loaded from: classes3.dex */
    private static final class b implements z.e {

        /* renamed from: a  reason: collision with root package name */
        static final z.e f8098a = new b();

        private b() {
        }

        @Override // com.google.protobuf.z.e
        public boolean a(int i10) {
            if (d.forNumber(i10) != null) {
                return true;
            }
            return false;
        }
    }

    d(int i10) {
        this.value = i10;
    }

    public static d forNumber(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return FOREGROUND_BACKGROUND;
                }
                return BACKGROUND;
            }
            return FOREGROUND;
        }
        return APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public static z.d<d> internalGetValueMap() {
        return internalValueMap;
    }

    public static z.e internalGetVerifier() {
        return b.f8098a;
    }

    @Override // com.google.protobuf.z.c
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static d valueOf(int i10) {
        return forNumber(i10);
    }
}
