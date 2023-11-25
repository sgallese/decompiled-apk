package androidx.appcompat.app;

/* compiled from: TwilightCalculator.java */
/* loaded from: classes.dex */
class h0 {

    /* renamed from: d  reason: collision with root package name */
    private static h0 f887d;

    /* renamed from: a  reason: collision with root package name */
    public long f888a;

    /* renamed from: b  reason: collision with root package name */
    public long f889b;

    /* renamed from: c  reason: collision with root package name */
    public int f890c;

    h0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h0 b() {
        if (f887d == null) {
            f887d = new h0();
        }
        return f887d;
    }

    public void a(long j10, double d10, double d11) {
        double d12 = (0.01720197f * (((float) (j10 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d11) / 360.0d) + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d13 = 0.01745329238474369d * d10;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d13) * Math.sin(asin))) / (Math.cos(d13) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f890c = 1;
            this.f888a = -1L;
            this.f889b = -1L;
        } else if (sin2 <= -1.0d) {
            this.f890c = 0;
            this.f888a = -1L;
            this.f889b = -1L;
        } else {
            double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
            this.f888a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.f889b = round2;
            if (round2 < j10 && this.f888a > j10) {
                this.f890c = 0;
            } else {
                this.f890c = 1;
            }
        }
    }
}
