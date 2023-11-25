package w2;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import w2.b;

/* compiled from: CursorAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: f  reason: collision with root package name */
    protected boolean f25344f;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f25345m;

    /* renamed from: p  reason: collision with root package name */
    protected Cursor f25346p;

    /* renamed from: q  reason: collision with root package name */
    protected Context f25347q;

    /* renamed from: r  reason: collision with root package name */
    protected int f25348r;

    /* renamed from: s  reason: collision with root package name */
    protected C0581a f25349s;

    /* renamed from: t  reason: collision with root package name */
    protected DataSetObserver f25350t;

    /* renamed from: u  reason: collision with root package name */
    protected w2.b f25351u;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CursorAdapter.java */
    /* renamed from: w2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0581a extends ContentObserver {
        C0581a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CursorAdapter.java */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f25344f = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f25344f = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        int i10;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        f(context, cursor, i10);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    @Override // w2.b.a
    public Cursor b() {
        return this.f25346p;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i10) {
        int i11;
        boolean z10 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f25345m = true;
        } else {
            this.f25345m = false;
        }
        if (cursor != null) {
            z10 = true;
        }
        this.f25346p = cursor;
        this.f25344f = z10;
        this.f25347q = context;
        if (z10) {
            i11 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i11 = -1;
        }
        this.f25348r = i11;
        if ((i10 & 2) == 2) {
            this.f25349s = new C0581a();
            this.f25350t = new b();
        } else {
            this.f25349s = null;
            this.f25350t = null;
        }
        if (z10) {
            C0581a c0581a = this.f25349s;
            if (c0581a != null) {
                cursor.registerContentObserver(c0581a);
            }
            DataSetObserver dataSetObserver = this.f25350t;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (this.f25344f && (cursor = this.f25346p) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f25344f) {
            this.f25346p.moveToPosition(i10);
            if (view == null) {
                view = g(this.f25347q, this.f25346p, viewGroup);
            }
            e(view, this.f25347q, this.f25346p);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f25351u == null) {
            this.f25351u = new w2.b(this);
        }
        return this.f25351u;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (this.f25344f && (cursor = this.f25346p) != null) {
            cursor.moveToPosition(i10);
            return this.f25346p;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.f25344f || (cursor = this.f25346p) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f25346p.getLong(this.f25348r);
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f25344f) {
            if (this.f25346p.moveToPosition(i10)) {
                if (view == null) {
                    view = h(this.f25347q, this.f25346p, viewGroup);
                }
                e(view, this.f25347q, this.f25346p);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (this.f25345m && (cursor = this.f25346p) != null && !cursor.isClosed()) {
            this.f25344f = this.f25346p.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f25346p;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0581a c0581a = this.f25349s;
            if (c0581a != null) {
                cursor2.unregisterContentObserver(c0581a);
            }
            DataSetObserver dataSetObserver = this.f25350t;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f25346p = cursor;
        if (cursor != null) {
            C0581a c0581a2 = this.f25349s;
            if (c0581a2 != null) {
                cursor.registerContentObserver(c0581a2);
            }
            DataSetObserver dataSetObserver2 = this.f25350t;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f25348r = cursor.getColumnIndexOrThrow("_id");
            this.f25344f = true;
            notifyDataSetChanged();
        } else {
            this.f25348r = -1;
            this.f25344f = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
