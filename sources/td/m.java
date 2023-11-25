package td;

/* compiled from: Image.java */
/* loaded from: classes4.dex */
public class m extends s {

    /* renamed from: f  reason: collision with root package name */
    private String f23739f;

    /* renamed from: g  reason: collision with root package name */
    private String f23740g;

    public m() {
    }

    @Override // td.s
    public void a(z zVar) {
        zVar.g(this);
    }

    @Override // td.s
    protected String k() {
        return "destination=" + this.f23739f + ", title=" + this.f23740g;
    }

    public String m() {
        return this.f23739f;
    }

    public m(String str, String str2) {
        this.f23739f = str;
        this.f23740g = str2;
    }
}
