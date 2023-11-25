package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.q0;
import com.google.protobuf.r1;
import com.google.protobuf.t;
import com.google.protobuf.x;
import com.google.protobuf.x.a;
import com.google.protobuf.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes3.dex */
public abstract class x<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected m1 unknownFields = m1.c();
    protected int memoizedSerializedSize = -1;

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes3.dex */
    public static abstract class a<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0255a<MessageType, BuilderType> {

        /* renamed from: f  reason: collision with root package name */
        private final MessageType f12464f;

        /* renamed from: m  reason: collision with root package name */
        protected MessageType f12465m;

        /* renamed from: p  reason: collision with root package name */
        protected boolean f12466p = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(MessageType messagetype) {
            this.f12464f = messagetype;
            this.f12465m = (MessageType) messagetype.z(f.NEW_MUTABLE_INSTANCE);
        }

        private void D(MessageType messagetype, MessageType messagetype2) {
            b1.a().e(messagetype).a(messagetype, messagetype2);
        }

        @Override // com.google.protobuf.r0
        /* renamed from: A  reason: merged with bridge method [inline-methods] */
        public MessageType c() {
            return this.f12464f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.a.AbstractC0255a
        /* renamed from: B  reason: merged with bridge method [inline-methods] */
        public BuilderType r(MessageType messagetype) {
            return C(messagetype);
        }

        public BuilderType C(MessageType messagetype) {
            y();
            D(this.f12465m, messagetype);
            return this;
        }

        @Override // com.google.protobuf.q0.a
        /* renamed from: u  reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType x10 = x();
            if (x10.b()) {
                return x10;
            }
            throw a.AbstractC0255a.t(x10);
        }

        @Override // com.google.protobuf.q0.a
        /* renamed from: v  reason: merged with bridge method [inline-methods] */
        public MessageType x() {
            if (this.f12466p) {
                return this.f12465m;
            }
            this.f12465m.I();
            this.f12466p = true;
            return this.f12465m;
        }

        /* renamed from: w  reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) c().n();
            buildertype.C(x());
            return buildertype;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void y() {
            if (this.f12466p) {
                z();
                this.f12466p = false;
            }
        }

        protected void z() {
            MessageType messagetype = (MessageType) this.f12465m.z(f.NEW_MUTABLE_INSTANCE);
            D(messagetype, this.f12465m);
            this.f12465m = messagetype;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes3.dex */
    protected static class b<T extends x<T, ?>> extends com.google.protobuf.b<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f12467b;

        public b(T t10) {
            this.f12467b = t10;
        }

        @Override // com.google.protobuf.y0
        /* renamed from: g  reason: merged with bridge method [inline-methods] */
        public T b(i iVar, o oVar) throws InvalidProtocolBufferException {
            return (T) x.N(this.f12467b, iVar, oVar);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes3.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends x<MessageType, BuilderType> implements r0 {
        protected t<d> extensions = t.h();

        /* JADX INFO: Access modifiers changed from: package-private */
        public t<d> Q() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.x, com.google.protobuf.r0
        public /* bridge */ /* synthetic */ q0 c() {
            return super.c();
        }

        @Override // com.google.protobuf.x, com.google.protobuf.q0
        public /* bridge */ /* synthetic */ q0.a d() {
            return super.d();
        }

        @Override // com.google.protobuf.x, com.google.protobuf.q0
        public /* bridge */ /* synthetic */ q0.a n() {
            return super.n();
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes3.dex */
    static final class d implements t.b<d> {

        /* renamed from: f  reason: collision with root package name */
        final z.d<?> f12468f;

        /* renamed from: m  reason: collision with root package name */
        final int f12469m;

        /* renamed from: p  reason: collision with root package name */
        final r1.b f12470p;

        /* renamed from: q  reason: collision with root package name */
        final boolean f12471q;

        /* renamed from: r  reason: collision with root package name */
        final boolean f12472r;

        @Override // com.google.protobuf.t.b
        public boolean a() {
            return this.f12471q;
        }

        @Override // java.lang.Comparable
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f12469m - dVar.f12469m;
        }

        @Override // com.google.protobuf.t.b
        public r1.b c() {
            return this.f12470p;
        }

        public z.d<?> d() {
            return this.f12468f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.t.b
        public q0.a e(q0.a aVar, q0 q0Var) {
            return ((a) aVar).C((x) q0Var);
        }

        @Override // com.google.protobuf.t.b
        public int getNumber() {
            return this.f12469m;
        }

        @Override // com.google.protobuf.t.b
        public r1.c h() {
            return this.f12470p.getJavaType();
        }

        @Override // com.google.protobuf.t.b
        public boolean isPacked() {
            return this.f12472r;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes3.dex */
    public static class e<ContainingType extends q0, Type> extends m<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        final q0 f12473a;

        /* renamed from: b  reason: collision with root package name */
        final d f12474b;

        public r1.b a() {
            return this.f12474b.c();
        }

        public q0 b() {
            return this.f12473a;
        }

        public int c() {
            return this.f12474b.getNumber();
        }

        public boolean d() {
            return this.f12474b.f12471q;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes3.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static z.g C() {
        return y.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> z.i<E> D() {
        return c1.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends x<?, ?>> T E(Class<T> cls) {
        x<?, ?> xVar = defaultInstanceMap.get(cls);
        if (xVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (xVar == null) {
            xVar = (T) ((x) p1.k(cls)).c();
            if (xVar != null) {
                defaultInstanceMap.put(cls, xVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) xVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object G(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    protected static final <T extends x<T, ?>> boolean H(T t10, boolean z10) {
        Object obj;
        byte byteValue = ((Byte) t10.z(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d10 = b1.a().e(t10).d(t10);
        if (z10) {
            f fVar = f.SET_MEMOIZED_IS_INITIALIZED;
            if (d10) {
                obj = t10;
            } else {
                obj = null;
            }
            t10.A(fVar, obj);
        }
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.z$g] */
    public static z.g J(z.g gVar) {
        int i10;
        int size = gVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return gVar.b2(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> z.i<E> K(z.i<E> iVar) {
        int i10;
        int size = iVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size * 2;
        }
        return iVar.b2(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object M(q0 q0Var, String str, Object[] objArr) {
        return new d1(q0Var, str, objArr);
    }

    static <T extends x<T, ?>> T N(T t10, i iVar, o oVar) throws InvalidProtocolBufferException {
        T t11 = (T) t10.z(f.NEW_MUTABLE_INSTANCE);
        try {
            f1 e10 = b1.a().e(t11);
            e10.e(t11, j.Q(iVar), oVar);
            e10.c(t11);
            return t11;
        } catch (InvalidProtocolBufferException e11) {
            e = e11;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.j(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).j(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends x<?, ?>> void O(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    protected Object A(f fVar, Object obj) {
        return B(fVar, obj, null);
    }

    protected abstract Object B(f fVar, Object obj, Object obj2);

    @Override // com.google.protobuf.r0
    /* renamed from: F  reason: merged with bridge method [inline-methods] */
    public final MessageType c() {
        return (MessageType) z(f.GET_DEFAULT_INSTANCE);
    }

    protected void I() {
        b1.a().e(this).c(this);
    }

    @Override // com.google.protobuf.q0
    /* renamed from: L  reason: merged with bridge method [inline-methods] */
    public final BuilderType n() {
        return (BuilderType) z(f.NEW_BUILDER);
    }

    @Override // com.google.protobuf.q0
    /* renamed from: P  reason: merged with bridge method [inline-methods] */
    public final BuilderType d() {
        BuilderType buildertype = (BuilderType) z(f.NEW_BUILDER);
        buildertype.C(this);
        return buildertype;
    }

    @Override // com.google.protobuf.r0
    public final boolean b() {
        return H(this, true);
    }

    @Override // com.google.protobuf.q0
    public void e(CodedOutputStream codedOutputStream) throws IOException {
        b1.a().e(this).b(this, k.P(codedOutputStream));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return b1.a().e(this).f(this, (x) obj);
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int i11 = b1.a().e(this).i(this);
        this.memoizedHashCode = i11;
        return i11;
    }

    @Override // com.google.protobuf.q0
    public int k() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = b1.a().e(this).g(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // com.google.protobuf.q0
    public final y0<MessageType> o() {
        return (y0) z(f.GET_PARSER);
    }

    @Override // com.google.protobuf.a
    int q() {
        return this.memoizedSerializedSize;
    }

    public String toString() {
        return s0.e(this, super.toString());
    }

    @Override // com.google.protobuf.a
    void u(int i10) {
        this.memoizedSerializedSize = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object w() throws Exception {
        return z(f.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType y() {
        return (BuilderType) z(f.NEW_BUILDER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object z(f fVar) {
        return B(fVar, null, null);
    }
}
