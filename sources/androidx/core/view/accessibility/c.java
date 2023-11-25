package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: AccessibilityManagerCompat.java */
    /* loaded from: classes.dex */
    static class a {
        static boolean a(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0078c(bVar));
        }

        static boolean b(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0078c(bVar));
        }
    }

    /* compiled from: AccessibilityManagerCompat.java */
    /* loaded from: classes.dex */
    public interface b {
        void onTouchExplorationStateChanged(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AccessibilityManagerCompat.java */
    /* renamed from: androidx.core.view.accessibility.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class AccessibilityManagerTouchExplorationStateChangeListenerC0078c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final b f4072a;

        AccessibilityManagerTouchExplorationStateChangeListenerC0078c(b bVar) {
            this.f4072a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0078c)) {
                return false;
            }
            return this.f4072a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0078c) obj).f4072a);
        }

        public int hashCode() {
            return this.f4072a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f4072a.onTouchExplorationStateChanged(z10);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
        return a.a(accessibilityManager, bVar);
    }

    public static boolean b(AccessibilityManager accessibilityManager, b bVar) {
        return a.b(accessibilityManager, bVar);
    }
}
