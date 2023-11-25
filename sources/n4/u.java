package n4;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.room.i f20239a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.b<s> f20240b;

    /* compiled from: WorkTagDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.b<s> {
        a(androidx.room.i iVar) {
            super(iVar);
        }

        @Override // androidx.room.o
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.b
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public void g(x3.f fVar, s sVar) {
            String str = sVar.f20237a;
            if (str == null) {
                fVar.r0(1);
            } else {
                fVar.p(1, str);
            }
            String str2 = sVar.f20238b;
            if (str2 == null) {
                fVar.r0(2);
            } else {
                fVar.p(2, str2);
            }
        }
    }

    public u(androidx.room.i iVar) {
        this.f20239a = iVar;
        this.f20240b = new a(iVar);
    }

    @Override // n4.t
    public List<String> a(String str) {
        androidx.room.l d10 = androidx.room.l.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            d10.r0(1);
        } else {
            d10.p(1, str);
        }
        this.f20239a.b();
        Cursor b10 = v3.c.b(this.f20239a, d10, false, null);
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

    @Override // n4.t
    public void b(s sVar) {
        this.f20239a.b();
        this.f20239a.c();
        try {
            this.f20240b.h(sVar);
            this.f20239a.r();
        } finally {
            this.f20239a.g();
        }
    }
}
