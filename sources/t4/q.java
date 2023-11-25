package t4;

import okio.f;

/* compiled from: DecodeUtils.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final okio.f f23607a;

    /* renamed from: b  reason: collision with root package name */
    private static final okio.f f23608b;

    /* renamed from: c  reason: collision with root package name */
    private static final okio.f f23609c;

    /* renamed from: d  reason: collision with root package name */
    private static final okio.f f23610d;

    /* renamed from: e  reason: collision with root package name */
    private static final okio.f f23611e;

    /* renamed from: f  reason: collision with root package name */
    private static final okio.f f23612f;

    /* renamed from: g  reason: collision with root package name */
    private static final okio.f f23613g;

    /* renamed from: h  reason: collision with root package name */
    private static final okio.f f23614h;

    /* renamed from: i  reason: collision with root package name */
    private static final okio.f f23615i;

    static {
        f.a aVar = okio.f.f20621q;
        f23607a = aVar.d("GIF87a");
        f23608b = aVar.d("GIF89a");
        f23609c = aVar.d("RIFF");
        f23610d = aVar.d("WEBP");
        f23611e = aVar.d("VP8X");
        f23612f = aVar.d("ftyp");
        f23613g = aVar.d("msf1");
        f23614h = aVar.d("hevc");
        f23615i = aVar.d("hevx");
    }

    public static final boolean a(h hVar, okio.e eVar) {
        if (d(hVar, eVar) && (eVar.a0(8L, f23613g) || eVar.a0(8L, f23614h) || eVar.a0(8L, f23615i))) {
            return true;
        }
        return false;
    }

    public static final boolean b(h hVar, okio.e eVar) {
        if (e(hVar, eVar) && eVar.a0(12L, f23611e) && eVar.m0(17L) && ((byte) (eVar.a().B(16L) & 2)) > 0) {
            return true;
        }
        return false;
    }

    public static final boolean c(h hVar, okio.e eVar) {
        if (!eVar.a0(0L, f23608b) && !eVar.a0(0L, f23607a)) {
            return false;
        }
        return true;
    }

    public static final boolean d(h hVar, okio.e eVar) {
        return eVar.a0(4L, f23612f);
    }

    public static final boolean e(h hVar, okio.e eVar) {
        if (eVar.a0(0L, f23609c) && eVar.a0(8L, f23610d)) {
            return true;
        }
        return false;
    }
}
