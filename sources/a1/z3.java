package a1;

/* compiled from: Outline.kt */
/* loaded from: classes.dex */
public abstract class z3 {

    /* compiled from: Outline.kt */
    /* loaded from: classes.dex */
    public static final class a extends z3 {

        /* renamed from: a  reason: collision with root package name */
        private final e4 f222a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e4 e4Var) {
            super(null);
            qc.q.i(e4Var, "path");
            this.f222a = e4Var;
        }

        public final e4 a() {
            return this.f222a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && qc.q.d(this.f222a, ((a) obj).f222a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f222a.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    /* loaded from: classes.dex */
    public static final class b extends z3 {

        /* renamed from: a  reason: collision with root package name */
        private final z0.h f223a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z0.h hVar) {
            super(null);
            qc.q.i(hVar, "rect");
            this.f223a = hVar;
        }

        public final z0.h a() {
            return this.f223a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && qc.q.d(this.f223a, ((b) obj).f223a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f223a.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    /* loaded from: classes.dex */
    public static final class c extends z3 {

        /* renamed from: a  reason: collision with root package name */
        private final z0.j f224a;

        /* renamed from: b  reason: collision with root package name */
        private final e4 f225b;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [qc.h] */
        /* JADX WARN: Type inference failed for: r0v2, types: [a1.e4] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(z0.j r3) {
            /*
                r2 = this;
                java.lang.String r0 = "roundRect"
                qc.q.i(r3, r0)
                r0 = 0
                r2.<init>(r0)
                r2.f224a = r3
                boolean r1 = a1.a4.a(r3)
                if (r1 != 0) goto L18
                a1.e4 r0 = a1.u0.a()
                r0.i(r3)
            L18:
                r2.f225b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a1.z3.c.<init>(z0.j):void");
        }

        public final z0.j a() {
            return this.f224a;
        }

        public final e4 b() {
            return this.f225b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && qc.q.d(this.f224a, ((c) obj).f224a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f224a.hashCode();
        }
    }

    private z3() {
    }

    public /* synthetic */ z3(qc.h hVar) {
        this();
    }
}
