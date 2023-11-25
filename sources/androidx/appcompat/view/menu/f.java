package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    g f1106f;

    /* renamed from: m  reason: collision with root package name */
    private int f1107m = -1;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1108p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f1109q;

    /* renamed from: r  reason: collision with root package name */
    private final LayoutInflater f1110r;

    /* renamed from: s  reason: collision with root package name */
    private final int f1111s;

    public f(g gVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1109q = z10;
        this.f1110r = layoutInflater;
        this.f1106f = gVar;
        this.f1111s = i10;
        a();
    }

    void a() {
        i v10 = this.f1106f.v();
        if (v10 != null) {
            ArrayList<i> z10 = this.f1106f.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (z10.get(i10) == v10) {
                    this.f1107m = i10;
                    return;
                }
            }
        }
        this.f1107m = -1;
    }

    public g b() {
        return this.f1106f;
    }

    @Override // android.widget.Adapter
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public i getItem(int i10) {
        ArrayList<i> E;
        if (this.f1109q) {
            E = this.f1106f.z();
        } else {
            E = this.f1106f.E();
        }
        int i11 = this.f1107m;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return E.get(i10);
    }

    public void d(boolean z10) {
        this.f1108p = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> E;
        if (this.f1109q) {
            E = this.f1106f.z();
        } else {
            E = this.f1106f.E();
        }
        if (this.f1107m < 0) {
            return E.size();
        }
        return E.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10;
        if (view == null) {
            view = this.f1110r.inflate(this.f1111s, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i12 = i10 - 1;
        if (i12 >= 0) {
            i11 = getItem(i12).getGroupId();
        } else {
            i11 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f1106f.F() && groupId != i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        n.a aVar = (n.a) view;
        if (this.f1108p) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
