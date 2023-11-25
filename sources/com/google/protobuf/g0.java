package com.google.protobuf;

import com.google.protobuf.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema.java */
/* loaded from: classes3.dex */
abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final g0 f12290a;

    /* renamed from: b  reason: collision with root package name */
    private static final g0 f12291b;

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes3.dex */
    private static final class b extends g0 {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?> f12292c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) p1.C(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j10, int i10) {
            e0 e0Var;
            List<L> arrayList;
            List<L> f10 = f(obj, j10);
            if (f10.isEmpty()) {
                if (f10 instanceof f0) {
                    arrayList = new e0(i10);
                } else if ((f10 instanceof z0) && (f10 instanceof z.i)) {
                    arrayList = ((z.i) f10).b2(i10);
                } else {
                    arrayList = new ArrayList<>(i10);
                }
                p1.R(obj, j10, arrayList);
                return arrayList;
            }
            if (f12292c.isAssignableFrom(f10.getClass())) {
                ArrayList arrayList2 = new ArrayList(f10.size() + i10);
                arrayList2.addAll(f10);
                p1.R(obj, j10, arrayList2);
                e0Var = arrayList2;
            } else if (f10 instanceof o1) {
                e0 e0Var2 = new e0(f10.size() + i10);
                e0Var2.addAll((o1) f10);
                p1.R(obj, j10, e0Var2);
                e0Var = e0Var2;
            } else if ((f10 instanceof z0) && (f10 instanceof z.i)) {
                z.i iVar = (z.i) f10;
                if (!iVar.R0()) {
                    z.i b22 = iVar.b2(f10.size() + i10);
                    p1.R(obj, j10, b22);
                    return b22;
                }
                return f10;
            } else {
                return f10;
            }
            return e0Var;
        }

        @Override // com.google.protobuf.g0
        void c(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) p1.C(obj, j10);
            if (list instanceof f0) {
                unmodifiableList = ((f0) list).z0();
            } else if (f12292c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof z0) && (list instanceof z.i)) {
                    z.i iVar = (z.i) list;
                    if (iVar.R0()) {
                        iVar.c();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            p1.R(obj, j10, unmodifiableList);
        }

        @Override // com.google.protobuf.g0
        <E> void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            p1.R(obj, j10, f10);
        }

        @Override // com.google.protobuf.g0
        <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes3.dex */
    private static final class c extends g0 {
        private c() {
            super();
        }

        static <E> z.i<E> f(Object obj, long j10) {
            return (z.i) p1.C(obj, j10);
        }

        @Override // com.google.protobuf.g0
        void c(Object obj, long j10) {
            f(obj, j10).c();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.protobuf.g0
        <E> void d(Object obj, Object obj2, long j10) {
            z.i<E> f10 = f(obj, j10);
            z.i<E> f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            z.i<E> iVar = f10;
            iVar = f10;
            if (size > 0 && size2 > 0) {
                boolean R0 = f10.R0();
                z.i<E> iVar2 = f10;
                if (!R0) {
                    iVar2 = f10.b2(size2 + size);
                }
                iVar2.addAll(f11);
                iVar = iVar2;
            }
            if (size > 0) {
                f11 = iVar;
            }
            p1.R(obj, j10, f11);
        }

        @Override // com.google.protobuf.g0
        <L> List<L> e(Object obj, long j10) {
            int i10;
            z.i f10 = f(obj, j10);
            if (!f10.R0()) {
                int size = f10.size();
                if (size == 0) {
                    i10 = 10;
                } else {
                    i10 = size * 2;
                }
                z.i b22 = f10.b2(i10);
                p1.R(obj, j10, b22);
                return b22;
            }
            return f10;
        }
    }

    static {
        f12290a = new b();
        f12291b = new c();
    }

    private g0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g0 a() {
        return f12290a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g0 b() {
        return f12291b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j10);
}
