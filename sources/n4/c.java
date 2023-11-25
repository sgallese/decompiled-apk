package n4;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.i f20161a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.b<n4.a> f20162b;

    /* compiled from: DependencyDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.b<n4.a> {
        a(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // androidx.room.b
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public void g(x3.f fVar, n4.a aVar) {
            String str = aVar.f20159a;
            if (str == null) {
                fVar.r0(1);
            } else {
                fVar.p(1, str);
            }
            String str2 = aVar.f20160b;
            if (str2 == null) {
                fVar.r0(2);
            } else {
                fVar.p(2, str2);
            }
        }
    }

    public c(androidx.room.i iVar) {
        this.f20161a = iVar;
        this.f20162b = new a(iVar);
    }

    @Override // n4.b
    public List<String> a(String str) {
        androidx.room.l d10 = androidx.room.l.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20161a.b();
        Cursor b10 = v3.c.b(this.f20161a, d10, false, null);
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

    @Override // n4.b
    public void b(n4.a aVar) {
        this.f20161a.b();
        this.f20161a.c();
        try {
            this.f20162b.h(aVar);
            this.f20161a.r();
        } finally {
            this.f20161a.g();
        }
    }

    @Override // n4.b
    public boolean c(String str) {
        boolean z10 = true;
        androidx.room.l d10 = androidx.room.l.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20161a.b();
        boolean z11 = false;
        Cursor b10 = v3.c.b(this.f20161a, d10, false, null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // n4.b
    public boolean d(String str) {
        boolean z10 = true;
        androidx.room.l d10 = androidx.room.l.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20161a.b();
        boolean z11 = false;
        Cursor b10 = v3.c.b(this.f20161a, d10, false, null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            b10.close();
            d10.release();
        }
    }
}
