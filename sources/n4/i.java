package n4;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.i f20171a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.b<g> f20172b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.room.o f20173c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.b<g> {
        a(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // androidx.room.b
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public void g(x3.f fVar, g gVar) {
            String str = gVar.f20169a;
            if (str == null) {
                fVar.r0(1);
            } else {
                fVar.p(1, str);
            }
            fVar.N(2, gVar.f20170b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    class b extends androidx.room.o {
        b(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(androidx.room.i iVar) {
        this.f20171a = iVar;
        this.f20172b = new a(iVar);
        this.f20173c = new b(iVar);
    }

    @Override // n4.h
    public List<String> a() {
        androidx.room.l d10 = androidx.room.l.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f20171a.b();
        Cursor b10 = v3.c.b(this.f20171a, d10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // n4.h
    public void b(g gVar) {
        this.f20171a.b();
        this.f20171a.c();
        try {
            this.f20172b.h(gVar);
            this.f20171a.r();
        } finally {
            this.f20171a.g();
        }
    }

    @Override // n4.h
    public g c(String str) {
        androidx.room.l d10 = androidx.room.l.d("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20171a.b();
        g gVar = null;
        Cursor b10 = v3.c.b(this.f20171a, d10, false, null);
        try {
            int b11 = v3.b.b(b10, "work_spec_id");
            int b12 = v3.b.b(b10, "system_id");
            if (b10.moveToFirst()) {
                gVar = new g(b10.getString(b11), b10.getInt(b12));
            }
            return gVar;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // n4.h
    public void d(String str) {
        this.f20171a.b();
        x3.f a10 = this.f20173c.a();
        if (str == null) {
            a10.r0(1);
        } else {
            a10.p(1, str);
        }
        this.f20171a.c();
        try {
            a10.u();
            this.f20171a.r();
        } finally {
            this.f20171a.g();
            this.f20173c.f(a10);
        }
    }
}
