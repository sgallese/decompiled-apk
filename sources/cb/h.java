package cb;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import cb.e;
import java.util.Iterator;
import java.util.List;

/* compiled from: MarkwonImpl.java */
/* loaded from: classes4.dex */
class h extends e {

    /* renamed from: a  reason: collision with root package name */
    private final TextView.BufferType f8920a;

    /* renamed from: b  reason: collision with root package name */
    private final ud.d f8921b;

    /* renamed from: c  reason: collision with root package name */
    private final m f8922c;

    /* renamed from: d  reason: collision with root package name */
    private final g f8923d;

    /* renamed from: e  reason: collision with root package name */
    private final List<i> f8924e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8925f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(TextView.BufferType bufferType, e.b bVar, ud.d dVar, m mVar, g gVar, List<i> list, boolean z10) {
        this.f8920a = bufferType;
        this.f8921b = dVar;
        this.f8922c = mVar;
        this.f8923d = gVar;
        this.f8924e = list;
        this.f8925f = z10;
    }

    @Override // cb.e
    public void b(TextView textView, Spanned spanned) {
        Iterator<i> it = this.f8924e.iterator();
        while (it.hasNext()) {
            it.next().beforeSetText(textView, spanned);
        }
        textView.setText(spanned, this.f8920a);
        Iterator<i> it2 = this.f8924e.iterator();
        while (it2.hasNext()) {
            it2.next().afterSetText(textView);
        }
    }

    @Override // cb.e
    public Spanned c(String str) {
        Spanned e10 = e(d(str));
        if (TextUtils.isEmpty(e10) && this.f8925f && !TextUtils.isEmpty(str)) {
            return new SpannableStringBuilder(str);
        }
        return e10;
    }

    public td.s d(String str) {
        Iterator<i> it = this.f8924e.iterator();
        while (it.hasNext()) {
            str = it.next().processMarkdown(str);
        }
        return this.f8921b.b(str);
    }

    public Spanned e(td.s sVar) {
        Iterator<i> it = this.f8924e.iterator();
        while (it.hasNext()) {
            it.next().beforeRender(sVar);
        }
        l a10 = this.f8922c.a();
        sVar.a(a10);
        Iterator<i> it2 = this.f8924e.iterator();
        while (it2.hasNext()) {
            it2.next().afterRender(sVar, a10);
        }
        return a10.builder().l();
    }
}
