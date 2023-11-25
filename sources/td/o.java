package td;

/* compiled from: Link.java */
/* loaded from: classes4.dex */
public class o extends s {

    /* renamed from: f  reason: collision with root package name */
    private String f23742f;

    /* renamed from: g  reason: collision with root package name */
    private String f23743g;

    public o() {
    }

    @Override // td.s
    public void a(z zVar) {
        zVar.D(this);
    }

    @Override // td.s
    protected String k() {
        return "destination=" + this.f23742f + ", title=" + this.f23743g;
    }

    public String m() {
        return this.f23742f;
    }

    public o(String str, String str2) {
        this.f23742f = str;
        this.f23743g = str2;
    }
}
