package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: f  reason: collision with root package name */
    final androidx.collection.g<String, Long> f6232f;

    /* renamed from: m  reason: collision with root package name */
    private final Handler f6233m;

    /* renamed from: p  reason: collision with root package name */
    private final List<Preference> f6234p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6235q;

    /* renamed from: r  reason: collision with root package name */
    private int f6236r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6237s;

    /* renamed from: t  reason: collision with root package name */
    private int f6238t;

    /* renamed from: u  reason: collision with root package name */
    private final Runnable f6239u;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f6232f.clear();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public interface c {
        int c(Preference preference);

        int e(String str);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f6232f = new androidx.collection.g<>();
        this.f6233m = new Handler(Looper.getMainLooper());
        this.f6235q = true;
        this.f6236r = 0;
        this.f6237s = false;
        this.f6238t = Integer.MAX_VALUE;
        this.f6239u = new a();
        this.f6234p = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.A0, i10, i11);
        int i12 = t.C0;
        this.f6235q = androidx.core.content.res.l.b(obtainStyledAttributes, i12, i12, true);
        int i13 = t.B0;
        if (obtainStyledAttributes.hasValue(i13)) {
            p(androidx.core.content.res.l.d(obtainStyledAttributes, i13, i13, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    private boolean o(Preference preference) {
        boolean remove;
        synchronized (this) {
            preference.onPrepareForRemoval();
            if (preference.getParent() == this) {
                preference.assignParent(null);
            }
            remove = this.f6234p.remove(preference);
            if (remove) {
                String key = preference.getKey();
                if (key != null) {
                    this.f6232f.put(key, Long.valueOf(preference.getId()));
                    this.f6233m.removeCallbacks(this.f6239u);
                    this.f6233m.post(this.f6239u);
                }
                if (this.f6237s) {
                    preference.onDetached();
                }
            }
        }
        return remove;
    }

    public void b(Preference preference) {
        d(preference);
    }

    public boolean d(Preference preference) {
        long f10;
        if (this.f6234p.contains(preference)) {
            return true;
        }
        if (preference.getKey() != null) {
            PreferenceGroup preferenceGroup = this;
            while (preferenceGroup.getParent() != null) {
                preferenceGroup = preferenceGroup.getParent();
            }
            String key = preference.getKey();
            if (preferenceGroup.f(key) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + key + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.getOrder() == Integer.MAX_VALUE) {
            if (this.f6235q) {
                int i10 = this.f6236r;
                this.f6236r = i10 + 1;
                preference.setOrder(i10);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).q(this.f6235q);
            }
        }
        int binarySearch = Collections.binarySearch(this.f6234p, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        if (!m(preference)) {
            return false;
        }
        synchronized (this) {
            this.f6234p.add(binarySearch, preference);
        }
        k preferenceManager = getPreferenceManager();
        String key2 = preference.getKey();
        if (key2 != null && this.f6232f.containsKey(key2)) {
            f10 = this.f6232f.get(key2).longValue();
            this.f6232f.remove(key2);
        } else {
            f10 = preferenceManager.f();
        }
        preference.onAttachedToHierarchy(preferenceManager, f10);
        preference.assignParent(this);
        if (this.f6237s) {
            preference.onAttached();
        }
        notifyHierarchyChanged();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void dispatchRestoreInstanceState(Bundle bundle) {
        super.dispatchRestoreInstanceState(bundle);
        int k10 = k();
        for (int i10 = 0; i10 < k10; i10++) {
            j(i10).dispatchRestoreInstanceState(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void dispatchSaveInstanceState(Bundle bundle) {
        super.dispatchSaveInstanceState(bundle);
        int k10 = k();
        for (int i10 = 0; i10 < k10; i10++) {
            j(i10).dispatchSaveInstanceState(bundle);
        }
    }

    public <T extends Preference> T f(CharSequence charSequence) {
        T t10;
        if (charSequence != null) {
            if (TextUtils.equals(getKey(), charSequence)) {
                return this;
            }
            int k10 = k();
            for (int i10 = 0; i10 < k10; i10++) {
                T t11 = (T) j(i10);
                if (TextUtils.equals(t11.getKey(), charSequence)) {
                    return t11;
                }
                if ((t11 instanceof PreferenceGroup) && (t10 = (T) ((PreferenceGroup) t11).f(charSequence)) != null) {
                    return t10;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    public int g() {
        return this.f6238t;
    }

    public b i() {
        return null;
    }

    public Preference j(int i10) {
        return this.f6234p.get(i10);
    }

    public int k() {
        return this.f6234p.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l() {
        return true;
    }

    protected boolean m(Preference preference) {
        preference.onParentChanged(this, shouldDisableDependents());
        return true;
    }

    public void n() {
        synchronized (this) {
            List<Preference> list = this.f6234p;
            for (int size = list.size() - 1; size >= 0; size--) {
                o(list.get(0));
            }
        }
        notifyHierarchyChanged();
    }

    @Override // androidx.preference.Preference
    public void notifyDependencyChange(boolean z10) {
        super.notifyDependencyChange(z10);
        int k10 = k();
        for (int i10 = 0; i10 < k10; i10++) {
            j(i10).onParentChanged(this, z10);
        }
    }

    @Override // androidx.preference.Preference
    public void onAttached() {
        super.onAttached();
        this.f6237s = true;
        int k10 = k();
        for (int i10 = 0; i10 < k10; i10++) {
            j(i10).onAttached();
        }
    }

    @Override // androidx.preference.Preference
    public void onDetached() {
        super.onDetached();
        this.f6237s = false;
        int k10 = k();
        for (int i10 = 0; i10 < k10; i10++) {
            j(i10).onDetached();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            this.f6238t = savedState.f6240f;
            super.onRestoreInstanceState(savedState.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f6238t);
    }

    public void p(int i10) {
        if (i10 != Integer.MAX_VALUE && !hasKey()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f6238t = i10;
    }

    public void q(boolean z10) {
        this.f6235q = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        synchronized (this) {
            Collections.sort(this.f6234p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        int f6240f;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f6240f = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6240f);
        }

        SavedState(Parcelable parcelable, int i10) {
            super(parcelable);
            this.f6240f = i10;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
