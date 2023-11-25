package t1;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class u extends qc.r implements pc.p<a<dc.c<? extends Boolean>>, a<dc.c<? extends Boolean>>, a<dc.c<? extends Boolean>>> {

    /* renamed from: f  reason: collision with root package name */
    public static final u f23516f = new u();

    public u() {
        super(2);
    }

    @Override // pc.p
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public final a<dc.c<? extends Boolean>> invoke(a<dc.c<? extends Boolean>> aVar, a<dc.c<? extends Boolean>> aVar2) {
        String b10;
        dc.c<? extends Boolean> a10;
        qc.q.i(aVar2, "childValue");
        if (aVar == null || (b10 = aVar.b()) == null) {
            b10 = aVar2.b();
        }
        if (aVar == null || (a10 = aVar.a()) == null) {
            a10 = aVar2.a();
        }
        return new a<>(b10, a10);
    }
}
