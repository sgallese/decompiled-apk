package cb;

import android.content.Context;
import android.widget.TextView;
import cb.e;
import cb.g;
import cb.k;
import cb.n;
import db.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ud.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MarkwonBuilderImpl.java */
/* loaded from: classes4.dex */
public class f implements e.a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8902a;

    /* renamed from: b  reason: collision with root package name */
    private final List<i> f8903b = new ArrayList(3);

    /* renamed from: c  reason: collision with root package name */
    private TextView.BufferType f8904c = TextView.BufferType.SPANNABLE;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8905d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context) {
        this.f8902a = context;
    }

    private static List<i> b(List<i> list) {
        return new q(list).f();
    }

    @Override // cb.e.a
    public e.a a(i iVar) {
        this.f8903b.add(iVar);
        return this;
    }

    @Override // cb.e.a
    public e build() {
        if (!this.f8903b.isEmpty()) {
            List<i> b10 = b(this.f8903b);
            d.b bVar = new d.b();
            c.a j10 = db.c.j(this.f8902a);
            g.b bVar2 = new g.b();
            n.a aVar = new n.a();
            k.a aVar2 = new k.a();
            for (i iVar : b10) {
                iVar.configureParser(bVar);
                iVar.configureTheme(j10);
                iVar.configureConfiguration(bVar2);
                iVar.configureVisitor(aVar);
                iVar.configureSpansFactory(aVar2);
            }
            g i10 = bVar2.i(j10.z(), aVar2.build());
            return new h(this.f8904c, null, bVar.f(), m.b(aVar, i10), i10, Collections.unmodifiableList(b10), this.f8905d);
        }
        throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
    }
}
