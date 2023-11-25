package io.realm;

import io.realm.exceptions.RealmException;
import io.realm.internal.core.NativeRealmAny;
import io.realm.p0;

/* compiled from: RealmAnyOperator.java */
/* loaded from: classes4.dex */
public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    private NativeRealmAny f18152a;

    /* renamed from: b  reason: collision with root package name */
    private p0.a f18153b;

    /* compiled from: RealmAnyOperator.java */
    /* loaded from: classes4.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18154a;

        static {
            int[] iArr = new int[p0.a.values().length];
            f18154a = iArr;
            try {
                iArr[p0.a.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18154a[p0.a.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18154a[p0.a.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18154a[p0.a.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18154a[p0.a.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18154a[p0.a.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18154a[p0.a.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18154a[p0.a.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18154a[p0.a.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18154a[p0.a.UUID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18154a[p0.a.OBJECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18154a[p0.a.NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s0(p0.a aVar) {
        this.f18153b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s0 b(io.realm.a aVar, NativeRealmAny nativeRealmAny) {
        p0.a type = nativeRealmAny.getType();
        switch (a.f18154a[type.ordinal()]) {
            case 1:
                return new w(nativeRealmAny);
            case 2:
                return new e(nativeRealmAny);
            case 3:
                return new l1(nativeRealmAny);
            case 4:
                return new c(nativeRealmAny);
            case 5:
                return new i(nativeRealmAny);
            case 6:
                return new r(nativeRealmAny);
            case 7:
                return new m(nativeRealmAny);
            case 8:
                return new k(nativeRealmAny);
            case 9:
                return new f0(nativeRealmAny);
            case 10:
                return new n1(nativeRealmAny);
            case 11:
                if (aVar instanceof o0) {
                    try {
                        return new c1(aVar, nativeRealmAny, nativeRealmAny.getModelClass(aVar.f17242r, aVar.f17240p.p()));
                    } catch (RealmException unused) {
                    }
                }
                return new o(aVar, nativeRealmAny);
            case 12:
                return new c0(nativeRealmAny);
            default:
                throw new ClassCastException("Couldn't cast to " + type);
        }
    }

    private synchronized NativeRealmAny d() {
        if (this.f18152a == null) {
            this.f18152a = a();
        }
        return this.f18152a;
    }

    protected abstract NativeRealmAny a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public long c() {
        return d().getNativePtr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0.a e() {
        return this.f18153b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> f() {
        return this.f18153b.getTypedClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <T> T g(Class<T> cls);

    /* JADX INFO: Access modifiers changed from: protected */
    public s0(p0.a aVar, NativeRealmAny nativeRealmAny) {
        this.f18153b = aVar;
        this.f18152a = nativeRealmAny;
    }
}
