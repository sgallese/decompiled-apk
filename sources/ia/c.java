package ia;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* compiled from: UnsafeReflectionAccessor.java */
/* loaded from: classes3.dex */
final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private static Class f17125d;

    /* renamed from: b  reason: collision with root package name */
    private final Object f17126b = d();

    /* renamed from: c  reason: collision with root package name */
    private final Field f17127c = c();

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f17125d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ia.b
    public void b(AccessibleObject accessibleObject) {
        if (!e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e10) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
            }
        }
    }

    boolean e(AccessibleObject accessibleObject) {
        if (this.f17126b != null && this.f17127c != null) {
            try {
                f17125d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f17126b, accessibleObject, Long.valueOf(((Long) f17125d.getMethod("objectFieldOffset", Field.class).invoke(this.f17126b, this.f17127c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
