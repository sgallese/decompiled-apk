package ra;

import ab.b;

/* compiled from: EntryPoints.java */
/* loaded from: classes4.dex */
public final class a {
    public static <T> T a(Object obj, Class<T> cls) {
        if (obj instanceof ab.a) {
            return cls.cast(obj);
        }
        if (obj instanceof b) {
            return (T) a(((b) obj).generatedComponent(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), ab.a.class, b.class));
    }
}
