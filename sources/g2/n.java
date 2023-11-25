package g2;

import a1.m4;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import g2.o;

/* compiled from: TextForegroundStyle.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextForegroundStyle.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<Float> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o f16077f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o oVar) {
            super(0);
            this.f16077f = oVar;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f16077f.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextForegroundStyle.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.a<o> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o f16078f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o oVar) {
            super(0);
            this.f16078f = oVar;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return this.f16078f;
        }
    }

    public static o a(o oVar, o oVar2) {
        float d10;
        qc.q.i(oVar2, TaskSetupFragment.TYPE_OTHER);
        boolean z10 = oVar2 instanceof c;
        if (z10 && (oVar instanceof c)) {
            m4 f10 = ((c) oVar2).f();
            d10 = m.d(oVar2.d(), new a(oVar));
            return new c(f10, d10);
        } else if (z10 && !(oVar instanceof c)) {
            return oVar2;
        } else {
            if (z10 || !(oVar instanceof c)) {
                return oVar2.a(new b(oVar));
            }
            return oVar;
        }
    }

    public static o b(o oVar, pc.a aVar) {
        qc.q.i(aVar, TaskSetupFragment.TYPE_OTHER);
        if (qc.q.d(oVar, o.b.f16081b)) {
            return (o) aVar.invoke();
        }
        return oVar;
    }
}
