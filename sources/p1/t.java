package p1;

/* compiled from: BackwardsCompatNode.kt */
/* loaded from: classes.dex */
final class t implements pc.l<androidx.compose.ui.focus.g, dc.w> {

    /* renamed from: f  reason: collision with root package name */
    private final y0.i f20925f;

    public t(y0.i iVar) {
        qc.q.i(iVar, "modifier");
        this.f20925f = iVar;
    }

    public void a(androidx.compose.ui.focus.g gVar) {
        qc.q.i(gVar, "focusProperties");
        this.f20925f.l(new y0.h(gVar));
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(androidx.compose.ui.focus.g gVar) {
        a(gVar);
        return dc.w.f13270a;
    }
}
