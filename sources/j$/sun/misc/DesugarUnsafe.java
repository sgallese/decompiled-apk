package j$.sun.misc;

import j$.com.android.tools.r8.DesugarVarHandle$$ExternalSyntheticBackportWithForwarding0;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class DesugarUnsafe {
    private static final DesugarUnsafe theUnsafeWrapper;
    private final Unsafe theUnsafe;

    static {
        Field unsafeField = getUnsafeField();
        unsafeField.setAccessible(true);
        try {
            theUnsafeWrapper = new DesugarUnsafe((Unsafe) unsafeField.get(null));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("Couldn't get the Unsafe", e10);
        }
    }

    DesugarUnsafe(Unsafe unsafe) {
        this.theUnsafe = unsafe;
    }

    public static DesugarUnsafe getUnsafe() {
        return theUnsafeWrapper;
    }

    private static Field getUnsafeField() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e10) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e10);
        }
    }

    public int arrayBaseOffset(Class cls) {
        return this.theUnsafe.arrayBaseOffset(cls);
    }

    public int arrayIndexScale(Class cls) {
        return this.theUnsafe.arrayIndexScale(cls);
    }

    public boolean compareAndSetInt(Object obj, long j10, int i10, int i11) {
        return this.theUnsafe.compareAndSwapInt(obj, j10, i10, i11);
    }

    public boolean compareAndSetLong(Object obj, long j10, long j11, long j12) {
        return this.theUnsafe.compareAndSwapLong(obj, j10, j11, j12);
    }

    public boolean compareAndSetObject(Object obj, long j10, Object obj2, Object obj3) {
        return DesugarVarHandle$$ExternalSyntheticBackportWithForwarding0.m(this.theUnsafe, obj, j10, obj2, obj3);
    }

    public int getAndAddInt(Object obj, long j10, int i10) {
        int intVolatile;
        do {
            intVolatile = this.theUnsafe.getIntVolatile(obj, j10);
        } while (!this.theUnsafe.compareAndSwapInt(obj, j10, intVolatile, intVolatile + i10));
        return intVolatile;
    }

    public Object getObjectAcquire(Object obj, long j10) {
        return this.theUnsafe.getObjectVolatile(obj, j10);
    }

    public long objectFieldOffset(Class cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        try {
            return objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Cannot find field:", e10);
        }
    }

    public long objectFieldOffset(Field field) {
        return this.theUnsafe.objectFieldOffset(field);
    }

    public void putObjectRelease(Object obj, long j10, Object obj2) {
        this.theUnsafe.putObjectVolatile(obj, j10, obj2);
    }
}
