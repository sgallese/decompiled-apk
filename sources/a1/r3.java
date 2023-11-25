package a1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Float16.kt */
/* loaded from: classes.dex */
public final class r3 implements Comparable<r3> {
    private static final float A;

    /* renamed from: f  reason: collision with root package name */
    public static final a f170f = new a(null);

    /* renamed from: m  reason: collision with root package name */
    private static final short f171m = d(5120);

    /* renamed from: p  reason: collision with root package name */
    private static final short f172p = d(-1025);

    /* renamed from: q  reason: collision with root package name */
    private static final short f173q = d(31743);

    /* renamed from: r  reason: collision with root package name */
    private static final short f174r = d(1024);

    /* renamed from: s  reason: collision with root package name */
    private static final short f175s = d(1);

    /* renamed from: t  reason: collision with root package name */
    private static final short f176t = d(32256);

    /* renamed from: u  reason: collision with root package name */
    private static final short f177u = d(-1024);

    /* renamed from: v  reason: collision with root package name */
    private static final short f178v = d(Short.MIN_VALUE);

    /* renamed from: w  reason: collision with root package name */
    private static final short f179w = d(31744);

    /* renamed from: x  reason: collision with root package name */
    private static final short f180x = d(0);

    /* renamed from: y  reason: collision with root package name */
    private static final short f181y = b(1.0f);

    /* renamed from: z  reason: collision with root package name */
    private static final short f182z = b(-1.0f);

    /* compiled from: Float16.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short b(float f10) {
            int i10;
            int floatToRawIntBits = Float.floatToRawIntBits(f10);
            int i11 = floatToRawIntBits >>> 31;
            int i12 = (floatToRawIntBits >>> 23) & 255;
            int i13 = floatToRawIntBits & 8388607;
            int i14 = 31;
            int i15 = 0;
            if (i12 == 255) {
                if (i13 != 0) {
                    i15 = 512;
                }
            } else {
                int i16 = (i12 - 127) + 15;
                if (i16 >= 31) {
                    i14 = 49;
                } else if (i16 <= 0) {
                    if (i16 >= -10) {
                        int i17 = (i13 | 8388608) >> (1 - i16);
                        if ((i17 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                            i17 += 8192;
                        }
                        i15 = i17 >> 13;
                    }
                    i14 = 0;
                } else {
                    i15 = i13 >> 13;
                    if ((i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                        i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                        return (short) i10;
                    }
                    i14 = i16;
                }
            }
            i10 = (i11 << 15) | (i14 << 10) | i15;
            return (short) i10;
        }
    }

    static {
        qc.j jVar = qc.j.f21682a;
        A = Float.intBitsToFloat(1056964608);
    }

    public static short b(float f10) {
        return d(f170f.b(f10));
    }

    public static final float f(short s10) {
        int i10;
        int i11;
        int i12 = s10 & 65535;
        int i13 = 32768 & i12;
        int i14 = (i12 >>> 10) & 31;
        int i15 = i12 & 1023;
        if (i14 == 0) {
            if (i15 != 0) {
                qc.j jVar = qc.j.f21682a;
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - A;
                if (i13 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        } else {
            int i16 = i15 << 13;
            if (i14 == 31) {
                if (i16 != 0) {
                    i16 |= 4194304;
                }
                i10 = i16;
                i11 = 255;
            } else {
                int i17 = (i14 - 15) + 127;
                i10 = i16;
                i11 = i17;
            }
        }
        int i18 = (i11 << 23) | (i13 << 16) | i10;
        qc.j jVar2 = qc.j.f21682a;
        return Float.intBitsToFloat(i18);
    }

    public static short d(short s10) {
        return s10;
    }
}
