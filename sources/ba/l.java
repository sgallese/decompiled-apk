package ba;

import com.google.protobuf.z;

/* compiled from: SessionVerbosity.java */
/* loaded from: classes3.dex */
public enum l implements z.c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final z.d<l> internalValueMap = new z.d<l>() { // from class: ba.l.a
        @Override // com.google.protobuf.z.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public l a(int i10) {
            return l.forNumber(i10);
        }
    };
    private final int value;

    /* compiled from: SessionVerbosity.java */
    /* loaded from: classes3.dex */
    private static final class b implements z.e {

        /* renamed from: a  reason: collision with root package name */
        static final z.e f8108a = new b();

        private b() {
        }

        @Override // com.google.protobuf.z.e
        public boolean a(int i10) {
            if (l.forNumber(i10) != null) {
                return true;
            }
            return false;
        }
    }

    l(int i10) {
        this.value = i10;
    }

    public static l forNumber(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        return SESSION_VERBOSITY_NONE;
    }

    public static z.d<l> internalGetValueMap() {
        return internalValueMap;
    }

    public static z.e internalGetVerifier() {
        return b.f8108a;
    }

    @Override // com.google.protobuf.z.c
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static l valueOf(int i10) {
        return forNumber(i10);
    }
}
