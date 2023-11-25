package eb;

import cb.r;
import cb.t;
import db.b;

/* compiled from: ListItemSpanFactory.java */
/* loaded from: classes4.dex */
public class g implements t {
    @Override // cb.t
    public Object a(cb.g gVar, r rVar) {
        if (b.a.BULLET == db.b.f13189a.d(rVar)) {
            return new fb.b(gVar.g(), db.b.f13190b.d(rVar).intValue());
        }
        return new fb.h(gVar.g(), String.valueOf(db.b.f13191c.d(rVar)) + ". ");
    }
}
