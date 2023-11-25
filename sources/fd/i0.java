package fd;

/* compiled from: SystemProps.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f15639a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f15639a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
