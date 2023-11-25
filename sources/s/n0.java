package s;

import j0.g3;
import s.m0;

/* compiled from: InfiniteTransition.kt */
/* loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InfiniteTransition.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ T f22797f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m0.a<T, V> f22798m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ T f22799p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ l0<T> f22800q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T t10, m0.a<T, V> aVar, T t11, l0<T> l0Var) {
            super(0);
            this.f22797f = t10;
            this.f22798m = aVar;
            this.f22799p = t11;
            this.f22800q = l0Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (qc.q.d(this.f22797f, this.f22798m.e()) && qc.q.d(this.f22799p, this.f22798m.f())) {
                return;
            }
            this.f22798m.t(this.f22797f, this.f22799p, this.f22800q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InfiniteTransition.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<j0.f0, j0.e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m0 f22801f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m0.a<T, V> f22802m;

        /* compiled from: Effects.kt */
        /* loaded from: classes.dex */
        public static final class a implements j0.e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m0 f22803a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ m0.a f22804b;

            public a(m0 m0Var, m0.a aVar) {
                this.f22803a = m0Var;
                this.f22804b = aVar;
            }

            @Override // j0.e0
            public void dispose() {
                this.f22803a.j(this.f22804b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m0 m0Var, m0.a<T, V> aVar) {
            super(1);
            this.f22801f = m0Var;
            this.f22802m = aVar;
        }

        @Override // pc.l
        public final j0.e0 invoke(j0.f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            this.f22801f.f(this.f22802m);
            return new a(this.f22801f, this.f22802m);
        }
    }

    public static final g3<Float> a(m0 m0Var, float f10, float f11, l0<Float> l0Var, String str, j0.l lVar, int i10, int i11) {
        String str2;
        qc.q.i(m0Var, "<this>");
        qc.q.i(l0Var, "animationSpec");
        lVar.e(-644770905);
        if ((i11 & 8) != 0) {
            str2 = "FloatAnimation";
        } else {
            str2 = str;
        }
        if (j0.n.K()) {
            j0.n.V(-644770905, i10, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:310)");
        }
        int i12 = i10 << 3;
        g3<Float> b10 = b(m0Var, Float.valueOf(f10), Float.valueOf(f11), k1.f(qc.j.f21682a), l0Var, str2, lVar, (i10 & 112) | 8 | (i10 & 896) | (57344 & i12) | (i12 & 458752), 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return b10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 ??, still in use, count: 1, list:
          (r10v0 ?? I:java.lang.Object) from 0x004f: INVOKE (r17v0 ?? I:j0.l), (r10v0 ?? I:java.lang.Object) type: INTERFACE call: j0.l.J(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:80)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:152)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:117)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:89)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:88)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final <T, V extends s.q> j0.g3<T> b(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 ??, still in use, count: 1, list:
          (r10v0 ?? I:java.lang.Object) from 0x004f: INVOKE (r17v0 ?? I:j0.l), (r10v0 ?? I:java.lang.Object) type: INTERFACE call: j0.l.J(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:80)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:152)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:117)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:89)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:88)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:233)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    public static final m0 c(String str, j0.l lVar, int i10, int i11) {
        lVar.e(1013651573);
        if ((i11 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (j0.n.K()) {
            j0.n.V(1013651573, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        lVar.e(-492369756);
        Object f10 = lVar.f();
        if (f10 == j0.l.f18688a.a()) {
            f10 = new m0(str);
            lVar.J(f10);
        }
        lVar.N();
        m0 m0Var = (m0) f10;
        m0Var.k(lVar, 8);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return m0Var;
    }
}
