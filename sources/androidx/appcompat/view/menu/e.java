package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    Context f1095f;

    /* renamed from: m  reason: collision with root package name */
    LayoutInflater f1096m;

    /* renamed from: p  reason: collision with root package name */
    g f1097p;

    /* renamed from: q  reason: collision with root package name */
    ExpandedMenuView f1098q;

    /* renamed from: r  reason: collision with root package name */
    int f1099r;

    /* renamed from: s  reason: collision with root package name */
    int f1100s;

    /* renamed from: t  reason: collision with root package name */
    int f1101t;

    /* renamed from: u  reason: collision with root package name */
    private m.a f1102u;

    /* renamed from: v  reason: collision with root package name */
    a f1103v;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: f  reason: collision with root package name */
        private int f1104f = -1;

        public a() {
            a();
        }

        void a() {
            i v10 = e.this.f1097p.v();
            if (v10 != null) {
                ArrayList<i> z10 = e.this.f1097p.z();
                int size = z10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (z10.get(i10) == v10) {
                        this.f1104f = i10;
                        return;
                    }
                }
            }
            this.f1104f = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public i getItem(int i10) {
            ArrayList<i> z10 = e.this.f1097p.z();
            int i11 = i10 + e.this.f1099r;
            int i12 = this.f1104f;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return z10.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f1097p.z().size() - e.this.f1099r;
            if (this.f1104f < 0) {
                return size;
            }
            return size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f1096m.inflate(eVar.f1101t, viewGroup, false);
            }
            ((n.a) view).e(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i10) {
        this(i10, 0);
        this.f1095f = context;
        this.f1096m = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        m.a aVar = this.f1102u;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    public ListAdapter b() {
        if (this.f1103v == null) {
            this.f1103v = new a();
        }
        return this.f1103v;
    }

    public n c(ViewGroup viewGroup) {
        if (this.f1098q == null) {
            this.f1098q = (ExpandedMenuView) this.f1096m.inflate(g.g.f15798g, viewGroup, false);
            if (this.f1103v == null) {
                this.f1103v = new a();
            }
            this.f1098q.setAdapter((ListAdapter) this.f1103v);
            this.f1098q.setOnItemClickListener(this);
        }
        return this.f1098q;
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z10) {
        a aVar = this.f1103v;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.f1102u = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(Context context, g gVar) {
        if (this.f1100s != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1100s);
            this.f1095f = contextThemeWrapper;
            this.f1096m = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1095f != null) {
            this.f1095f = context;
            if (this.f1096m == null) {
                this.f1096m = LayoutInflater.from(context);
            }
        }
        this.f1097p = gVar;
        a aVar = this.f1103v;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d(null);
        m.a aVar = this.f1102u;
        if (aVar != null) {
            aVar.b(rVar);
            return true;
        }
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f1097p.M(this.f1103v.getItem(i10), this, 0);
    }

    public e(int i10, int i11) {
        this.f1101t = i10;
        this.f1100s = i11;
    }
}
