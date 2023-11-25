package td;

/* compiled from: Block.java */
/* loaded from: classes4.dex */
public abstract class a extends s {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // td.s
    public void j(s sVar) {
        if (sVar instanceof a) {
            super.j(sVar);
            return;
        }
        throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
    }

    @Override // td.s
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public a f() {
        return (a) super.f();
    }
}
