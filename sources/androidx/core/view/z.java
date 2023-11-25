package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* compiled from: Menu.kt */
/* loaded from: classes.dex */
public final class z {

    /* compiled from: Menu.kt */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<MenuItem>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private int f4278f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Menu f4279m;

        a(Menu menu) {
            this.f4279m = menu;
        }

        @Override // java.util.Iterator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f4279m;
            int i10 = this.f4278f;
            this.f4278f = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f4278f < this.f4279m.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            dc.w wVar;
            Menu menu = this.f4279m;
            int i10 = this.f4278f - 1;
            this.f4278f = i10;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                menu.removeItem(item.getItemId());
                wVar = dc.w.f13270a;
            } else {
                wVar = null;
            }
            if (wVar != null) {
                return;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public static final Iterator<MenuItem> a(Menu menu) {
        return new a(menu);
    }
}
