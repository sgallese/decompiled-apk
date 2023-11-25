package d0;

import n1.s;
import v1.g0;

/* compiled from: SelectionController.kt */
/* loaded from: classes.dex */
public class j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f13042c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final j f13043d = new j(null, null);

    /* renamed from: a  reason: collision with root package name */
    private final s f13044a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f13045b;

    /* compiled from: SelectionController.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final j a() {
            return j.f13043d;
        }
    }

    public j(s sVar, g0 g0Var) {
        this.f13044a = sVar;
        this.f13045b = g0Var;
    }

    public static /* synthetic */ j c(j jVar, s sVar, g0 g0Var, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                sVar = jVar.f13044a;
            }
            if ((i10 & 2) != 0) {
                g0Var = jVar.f13045b;
            }
            return jVar.b(sVar, g0Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final j b(s sVar, g0 g0Var) {
        return new j(sVar, g0Var);
    }

    public final s d() {
        return this.f13044a;
    }

    public final g0 e() {
        return this.f13045b;
    }
}
