package ad;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public final class f1 implements r1 {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f502f;

    public f1(boolean z10) {
        this.f502f = z10;
    }

    @Override // ad.r1
    public boolean b() {
        return this.f502f;
    }

    @Override // ad.r1
    public j2 c() {
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        if (b()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
