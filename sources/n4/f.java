package n4;

import android.database.Cursor;

/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.i f20166a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.b<d> f20167b;

    /* compiled from: PreferenceDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.b<d> {
        a(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // androidx.room.b
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public void g(x3.f fVar, d dVar) {
            String str = dVar.f20164a;
            if (str == null) {
                fVar.r0(1);
            } else {
                fVar.p(1, str);
            }
            Long l10 = dVar.f20165b;
            if (l10 == null) {
                fVar.r0(2);
            } else {
                fVar.N(2, l10.longValue());
            }
        }
    }

    public f(androidx.room.i iVar) {
        this.f20166a = iVar;
        this.f20167b = new a(iVar);
    }

    @Override // n4.e
    public void a(d dVar) {
        this.f20166a.b();
        this.f20166a.c();
        try {
            this.f20167b.h(dVar);
            this.f20166a.r();
        } finally {
            this.f20166a.g();
        }
    }

    @Override // n4.e
    public Long b(String str) {
        androidx.room.l d10 = androidx.room.l.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20166a.b();
        Long l10 = null;
        Cursor b10 = v3.c.b(this.f20166a, d10, false, null);
        try {
            if (b10.moveToFirst() && !b10.isNull(0)) {
                l10 = Long.valueOf(b10.getLong(0));
            }
            return l10;
        } finally {
            b10.close();
            d10.release();
        }
    }
}
