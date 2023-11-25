package c0;

import j0.g3;
import n1.y0;

/* compiled from: TextFieldSize.kt */
/* loaded from: classes.dex */
public final class s0 {

    /* compiled from: TextFieldSize.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v1.k0 f8565f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextFieldSize.kt */
        /* renamed from: c0.s0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0217a extends qc.r implements pc.q<n1.l0, n1.g0, j2.b, n1.j0> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ r0 f8566f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TextFieldSize.kt */
            /* renamed from: c0.s0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0218a extends qc.r implements pc.l<y0.a, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ n1.y0 f8567f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0218a(n1.y0 y0Var) {
                    super(1);
                    this.f8567f = y0Var;
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
                    invoke2(aVar);
                    return dc.w.f13270a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(y0.a aVar) {
                    qc.q.i(aVar, "$this$layout");
                    y0.a.r(aVar, this.f8567f, 0, 0, 0.0f, 4, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0217a(r0 r0Var) {
                super(3);
                this.f8566f = r0Var;
            }

            public final n1.j0 a(n1.l0 l0Var, n1.g0 g0Var, long j10) {
                int l10;
                int l11;
                qc.q.i(l0Var, "$this$layout");
                qc.q.i(g0Var, "measurable");
                androidx.compose.foundation.layout.m.b(androidx.compose.ui.e.f2335a, 0.0f, 0.0f, 3, null);
                long b10 = this.f8566f.b();
                l10 = vc.l.l(j2.p.g(b10), j2.b.p(j10), j2.b.n(j10));
                l11 = vc.l.l(j2.p.f(b10), j2.b.o(j10), j2.b.m(j10));
                n1.y0 w10 = g0Var.w(j2.b.e(j10, l10, 0, l11, 0, 10, null));
                return n1.k0.b(l0Var, w10.A0(), w10.l0(), null, new C0218a(w10), 4, null);
            }

            @Override // pc.q
            public /* bridge */ /* synthetic */ n1.j0 invoke(n1.l0 l0Var, n1.g0 g0Var, j2.b bVar) {
                return a(l0Var, g0Var, bVar.t());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v1.k0 k0Var) {
            super(3);
            this.f8565f = k0Var;
        }

        public static final /* synthetic */ Object a(g3 g3Var) {
            return c(g3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object c(g3<? extends Object> g3Var) {
            return g3Var.getValue();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 ??, still in use, count: 1, list:
              (r9v2 ?? I:java.lang.Object) from 0x00dc: INVOKE (r12v0 ?? I:j0.l), (r9v2 ?? I:java.lang.Object) type: INTERFACE call: j0.l.J(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:221)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:152)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:117)
            	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:89)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:88)
            	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
            */
        public final androidx.compose.ui.e b(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 ??, still in use, count: 1, list:
              (r9v2 ?? I:java.lang.Object) from 0x00dc: INVOKE (r12v0 ?? I:j0.l), (r9v2 ?? I:java.lang.Object) type: INTERFACE call: j0.l.J(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:221)
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

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return b(eVar, lVar, num.intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, v1.k0 k0Var) {
        qc.q.i(eVar, "<this>");
        qc.q.i(k0Var, "style");
        return androidx.compose.ui.c.b(eVar, null, new a(k0Var), 1, null);
    }
}
