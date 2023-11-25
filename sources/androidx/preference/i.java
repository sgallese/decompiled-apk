package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.p0;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PreferenceGroupAdapter.java */
/* loaded from: classes.dex */
public class i extends RecyclerView.h<m> implements Preference.b, PreferenceGroup.c {

    /* renamed from: a  reason: collision with root package name */
    private final PreferenceGroup f6302a;

    /* renamed from: b  reason: collision with root package name */
    private List<Preference> f6303b;

    /* renamed from: c  reason: collision with root package name */
    private List<Preference> f6304c;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f6305d;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f6307f = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Handler f6306e = new Handler(Looper.getMainLooper());

    /* compiled from: PreferenceGroupAdapter.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreferenceGroupAdapter.java */
    /* loaded from: classes.dex */
    public class b implements Preference.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreferenceGroup f6309a;

        b(PreferenceGroup preferenceGroup) {
            this.f6309a = preferenceGroup;
        }

        @Override // androidx.preference.Preference.d
        public boolean a(Preference preference) {
            this.f6309a.p(Integer.MAX_VALUE);
            i.this.a(preference);
            this.f6309a.i();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PreferenceGroupAdapter.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        int f6311a;

        /* renamed from: b  reason: collision with root package name */
        int f6312b;

        /* renamed from: c  reason: collision with root package name */
        String f6313c;

        c(Preference preference) {
            this.f6313c = preference.getClass().getName();
            this.f6311a = preference.getLayoutResource();
            this.f6312b = preference.getWidgetLayoutResource();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f6311a != cVar.f6311a || this.f6312b != cVar.f6312b || !TextUtils.equals(this.f6313c, cVar.f6313c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((((527 + this.f6311a) * 31) + this.f6312b) * 31) + this.f6313c.hashCode();
        }
    }

    public i(PreferenceGroup preferenceGroup) {
        this.f6302a = preferenceGroup;
        preferenceGroup.setOnPreferenceChangeInternalListener(this);
        this.f6303b = new ArrayList();
        this.f6304c = new ArrayList();
        this.f6305d = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).s());
        } else {
            setHasStableIds(true);
        }
        m();
    }

    private androidx.preference.b f(PreferenceGroup preferenceGroup, List<Preference> list) {
        androidx.preference.b bVar = new androidx.preference.b(preferenceGroup.getContext(), list, preferenceGroup.getId());
        bVar.setOnPreferenceClickListener(new b(preferenceGroup));
        return bVar;
    }

    private List<Preference> g(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int k10 = preferenceGroup.k();
        int i10 = 0;
        for (int i11 = 0; i11 < k10; i11++) {
            Preference j10 = preferenceGroup.j(i11);
            if (j10.isVisible()) {
                if (j(preferenceGroup) && i10 >= preferenceGroup.g()) {
                    arrayList2.add(j10);
                } else {
                    arrayList.add(j10);
                }
                if (!(j10 instanceof PreferenceGroup)) {
                    i10++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) j10;
                    if (!preferenceGroup2.l()) {
                        continue;
                    } else if (j(preferenceGroup) && j(preferenceGroup2)) {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    } else {
                        for (Preference preference : g(preferenceGroup2)) {
                            if (j(preferenceGroup) && i10 >= preferenceGroup.g()) {
                                arrayList2.add(preference);
                            } else {
                                arrayList.add(preference);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        if (j(preferenceGroup) && i10 > preferenceGroup.g()) {
            arrayList.add(f(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private void h(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.r();
        int k10 = preferenceGroup.k();
        for (int i10 = 0; i10 < k10; i10++) {
            Preference j10 = preferenceGroup.j(i10);
            list.add(j10);
            c cVar = new c(j10);
            if (!this.f6305d.contains(cVar)) {
                this.f6305d.add(cVar);
            }
            if (j10 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) j10;
                if (preferenceGroup2.l()) {
                    h(list, preferenceGroup2);
                }
            }
            j10.setOnPreferenceChangeInternalListener(this);
        }
    }

    private boolean j(PreferenceGroup preferenceGroup) {
        if (preferenceGroup.g() != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @Override // androidx.preference.Preference.b
    public void a(Preference preference) {
        this.f6306e.removeCallbacks(this.f6307f);
        this.f6306e.post(this.f6307f);
    }

    @Override // androidx.preference.Preference.b
    public void b(Preference preference) {
        a(preference);
    }

    @Override // androidx.preference.PreferenceGroup.c
    public int c(Preference preference) {
        int size = this.f6304c.size();
        for (int i10 = 0; i10 < size; i10++) {
            Preference preference2 = this.f6304c.get(i10);
            if (preference2 != null && preference2.equals(preference)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.b
    public void d(Preference preference) {
        int indexOf = this.f6304c.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    @Override // androidx.preference.PreferenceGroup.c
    public int e(String str) {
        int size = this.f6304c.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (TextUtils.equals(str, this.f6304c.get(i10).getKey())) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f6304c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        if (!hasStableIds()) {
            return -1L;
        }
        return i(i10).getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        c cVar = new c(i(i10));
        int indexOf = this.f6305d.indexOf(cVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f6305d.size();
        this.f6305d.add(cVar);
        return size;
    }

    public Preference i(int i10) {
        if (i10 >= 0 && i10 < getItemCount()) {
            return this.f6304c.get(i10);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: k  reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(m mVar, int i10) {
        Preference i11 = i(i10);
        mVar.d();
        i11.onBindViewHolder(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public m onCreateViewHolder(ViewGroup viewGroup, int i10) {
        c cVar = this.f6305d.get(i10);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, t.f6372a);
        Drawable drawable = obtainStyledAttributes.getDrawable(t.f6375b);
        if (drawable == null) {
            drawable = h.a.b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(cVar.f6311a, viewGroup, false);
        if (inflate.getBackground() == null) {
            p0.y0(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i11 = cVar.f6312b;
            if (i11 != 0) {
                from.inflate(i11, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new m(inflate);
    }

    void m() {
        Iterator<Preference> it = this.f6303b.iterator();
        while (it.hasNext()) {
            it.next().setOnPreferenceChangeInternalListener(null);
        }
        ArrayList arrayList = new ArrayList(this.f6303b.size());
        this.f6303b = arrayList;
        h(arrayList, this.f6302a);
        this.f6304c = g(this.f6302a);
        k preferenceManager = this.f6302a.getPreferenceManager();
        if (preferenceManager != null) {
            preferenceManager.i();
        }
        notifyDataSetChanged();
        Iterator<Preference> it2 = this.f6303b.iterator();
        while (it2.hasNext()) {
            it2.next().clearWasDetached();
        }
    }
}
