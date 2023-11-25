package x3;

/* compiled from: SimpleSQLiteQuery.java */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: f  reason: collision with root package name */
    private final String f25710f;

    /* renamed from: m  reason: collision with root package name */
    private final Object[] f25711m;

    public a(String str, Object[] objArr) {
        this.f25710f = str;
        this.f25711m = objArr;
    }

    private static void a(d dVar, int i10, Object obj) {
        long j10;
        if (obj == null) {
            dVar.r0(i10);
        } else if (obj instanceof byte[]) {
            dVar.U(i10, (byte[]) obj);
        } else if (obj instanceof Float) {
            dVar.y(i10, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dVar.y(i10, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dVar.N(i10, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dVar.N(i10, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dVar.N(i10, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dVar.N(i10, ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dVar.p(i10, (String) obj);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j10 = 1;
            } else {
                j10 = 0;
            }
            dVar.N(i10, j10);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    public static void d(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            a(dVar, i10, obj);
        }
    }

    @Override // x3.e
    public void b(d dVar) {
        d(dVar, this.f25711m);
    }

    @Override // x3.e
    public String c() {
        return this.f25710f;
    }

    public a(String str) {
        this(str, null);
    }
}
