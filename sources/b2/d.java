package b2;

/* compiled from: EditCommand.kt */
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f7741a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7742b;

    /* compiled from: EditCommand.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f7743f = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Integer invoke() {
            return 0;
        }
    }

    public d(int i10, int i11) {
        boolean z10;
        this.f7741a = i10;
        this.f7742b = i11;
        if (i10 >= 0 && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
    }

    @Override // b2.f
    public void a(i iVar) {
        qc.q.i(iVar, "buffer");
        int j10 = iVar.j();
        int i10 = this.f7742b;
        int i11 = j10 + i10;
        if (((j10 ^ i11) & (i10 ^ i11)) < 0) {
            i11 = iVar.h();
        }
        iVar.b(iVar.j(), Math.min(i11, iVar.h()));
        iVar.b(Math.max(0, w.a(iVar.k(), this.f7741a, a.f7743f)), iVar.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f7741a == dVar.f7741a && this.f7742b == dVar.f7742b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f7741a * 31) + this.f7742b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f7741a + ", lengthAfterCursor=" + this.f7742b + ')';
    }
}
