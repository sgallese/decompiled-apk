package n4;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.i f20178a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.b<j> f20179b;

    /* compiled from: WorkNameDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.b<j> {
        a(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.b
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public void g(x3.f fVar, j jVar) {
            String str = jVar.f20176a;
            if (str == null) {
                fVar.r0(1);
            } else {
                fVar.p(1, str);
            }
            String str2 = jVar.f20177b;
            if (str2 == null) {
                fVar.r0(2);
            } else {
                fVar.p(2, str2);
            }
        }
    }

    public l(androidx.room.i iVar) {
        this.f20178a = iVar;
        this.f20179b = new a(iVar);
    }

    @Override // n4.k
    public void a(j jVar) {
        this.f20178a.b();
        this.f20178a.c();
        try {
            this.f20179b.h(jVar);
            this.f20178a.r();
        } finally {
            this.f20178a.g();
        }
    }

    @Override // n4.k
    public List<String> b(String str) {
        androidx.room.l d10 = androidx.room.l.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20178a.b();
        Cursor b10 = v3.c.b(this.f20178a, d10, false, null);
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
}
