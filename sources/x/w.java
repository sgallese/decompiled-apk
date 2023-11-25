package x;

/* compiled from: LazyDsl.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyDsl.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l {

        /* renamed from: f  reason: collision with root package name */
        public static final a f25676f = new a();

        a() {
            super(1);
        }

        public final Void a(int i10) {
            return null;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static /* synthetic */ void a(x xVar, Object obj, Object obj2, pc.q qVar, int i10, Object obj3) {
        if (obj3 == null) {
            if ((i10 & 1) != 0) {
                obj = null;
            }
            if ((i10 & 2) != 0) {
                obj2 = null;
            }
            xVar.a(obj, obj2, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(x xVar, int i10, pc.l lVar, pc.l lVar2, pc.r rVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                lVar = null;
            }
            if ((i11 & 4) != 0) {
                lVar2 = a.f25676f;
            }
            xVar.b(i10, lVar, lVar2, rVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }
}
