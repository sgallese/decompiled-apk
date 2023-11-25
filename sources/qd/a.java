package qd;

/* compiled from: BlockContent.java */
/* loaded from: classes4.dex */
class a {

    /* renamed from: b  reason: collision with root package name */
    private int f21690b = 0;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f21689a = new StringBuilder();

    public void a(CharSequence charSequence) {
        if (this.f21690b != 0) {
            this.f21689a.append('\n');
        }
        this.f21689a.append(charSequence);
        this.f21690b++;
    }

    public String b() {
        return this.f21689a.toString();
    }
}
