package c0;

import android.view.KeyEvent;

/* compiled from: KeyMapping.kt */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final s f8568a = new c(a(new qc.z() { // from class: c0.t.b
        @Override // wc.g
        public Object get(Object obj) {
            return Boolean.valueOf(i1.d.e(((i1.b) obj).f()));
        }
    }));

    /* compiled from: KeyMapping.kt */
    /* loaded from: classes.dex */
    public static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ pc.l<i1.b, Boolean> f8569a;

        /* JADX WARN: Multi-variable type inference failed */
        a(pc.l<? super i1.b, Boolean> lVar) {
            this.f8569a = lVar;
        }

        @Override // c0.s
        public q a(KeyEvent keyEvent) {
            boolean n10;
            qc.q.i(keyEvent, "event");
            if (this.f8569a.invoke(i1.b.a(keyEvent)).booleanValue() && i1.d.f(keyEvent)) {
                if (!i1.a.n(i1.d.a(keyEvent), z.f8641a.x())) {
                    return null;
                }
                return q.REDO;
            } else if (this.f8569a.invoke(i1.b.a(keyEvent)).booleanValue()) {
                long a10 = i1.d.a(keyEvent);
                z zVar = z.f8641a;
                if (i1.a.n(a10, zVar.d())) {
                    n10 = true;
                } else {
                    n10 = i1.a.n(a10, zVar.n());
                }
                if (n10) {
                    return q.COPY;
                }
                if (i1.a.n(a10, zVar.u())) {
                    return q.PASTE;
                }
                if (i1.a.n(a10, zVar.v())) {
                    return q.CUT;
                }
                if (i1.a.n(a10, zVar.a())) {
                    return q.SELECT_ALL;
                }
                if (i1.a.n(a10, zVar.w())) {
                    return q.REDO;
                }
                if (!i1.a.n(a10, zVar.x())) {
                    return null;
                }
                return q.UNDO;
            } else if (i1.d.e(keyEvent)) {
                return null;
            } else {
                if (i1.d.f(keyEvent)) {
                    long a11 = i1.d.a(keyEvent);
                    z zVar2 = z.f8641a;
                    if (i1.a.n(a11, zVar2.i())) {
                        return q.SELECT_LEFT_CHAR;
                    }
                    if (i1.a.n(a11, zVar2.j())) {
                        return q.SELECT_RIGHT_CHAR;
                    }
                    if (i1.a.n(a11, zVar2.k())) {
                        return q.SELECT_UP;
                    }
                    if (i1.a.n(a11, zVar2.h())) {
                        return q.SELECT_DOWN;
                    }
                    if (i1.a.n(a11, zVar2.r())) {
                        return q.SELECT_PAGE_UP;
                    }
                    if (i1.a.n(a11, zVar2.q())) {
                        return q.SELECT_PAGE_DOWN;
                    }
                    if (i1.a.n(a11, zVar2.p())) {
                        return q.SELECT_LINE_START;
                    }
                    if (i1.a.n(a11, zVar2.o())) {
                        return q.SELECT_LINE_END;
                    }
                    if (!i1.a.n(a11, zVar2.n())) {
                        return null;
                    }
                    return q.PASTE;
                }
                long a12 = i1.d.a(keyEvent);
                z zVar3 = z.f8641a;
                if (i1.a.n(a12, zVar3.i())) {
                    return q.LEFT_CHAR;
                }
                if (i1.a.n(a12, zVar3.j())) {
                    return q.RIGHT_CHAR;
                }
                if (i1.a.n(a12, zVar3.k())) {
                    return q.UP;
                }
                if (i1.a.n(a12, zVar3.h())) {
                    return q.DOWN;
                }
                if (i1.a.n(a12, zVar3.r())) {
                    return q.PAGE_UP;
                }
                if (i1.a.n(a12, zVar3.q())) {
                    return q.PAGE_DOWN;
                }
                if (i1.a.n(a12, zVar3.p())) {
                    return q.LINE_START;
                }
                if (i1.a.n(a12, zVar3.o())) {
                    return q.LINE_END;
                }
                if (i1.a.n(a12, zVar3.l())) {
                    return q.NEW_LINE;
                }
                if (i1.a.n(a12, zVar3.c())) {
                    return q.DELETE_PREV_CHAR;
                }
                if (i1.a.n(a12, zVar3.g())) {
                    return q.DELETE_NEXT_CHAR;
                }
                if (i1.a.n(a12, zVar3.s())) {
                    return q.PASTE;
                }
                if (i1.a.n(a12, zVar3.f())) {
                    return q.CUT;
                }
                if (i1.a.n(a12, zVar3.e())) {
                    return q.COPY;
                }
                if (!i1.a.n(a12, zVar3.t())) {
                    return null;
                }
                return q.TAB;
            }
        }
    }

    /* compiled from: KeyMapping.kt */
    /* loaded from: classes.dex */
    public static final class c implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f8571a;

        c(s sVar) {
            this.f8571a = sVar;
        }

        @Override // c0.s
        public q a(KeyEvent keyEvent) {
            qc.q.i(keyEvent, "event");
            q qVar = null;
            if (i1.d.f(keyEvent) && i1.d.e(keyEvent)) {
                long a10 = i1.d.a(keyEvent);
                z zVar = z.f8641a;
                if (i1.a.n(a10, zVar.i())) {
                    qVar = q.SELECT_LEFT_WORD;
                } else if (i1.a.n(a10, zVar.j())) {
                    qVar = q.SELECT_RIGHT_WORD;
                } else if (i1.a.n(a10, zVar.k())) {
                    qVar = q.SELECT_PREV_PARAGRAPH;
                } else if (i1.a.n(a10, zVar.h())) {
                    qVar = q.SELECT_NEXT_PARAGRAPH;
                }
            } else if (i1.d.e(keyEvent)) {
                long a11 = i1.d.a(keyEvent);
                z zVar2 = z.f8641a;
                if (i1.a.n(a11, zVar2.i())) {
                    qVar = q.LEFT_WORD;
                } else if (i1.a.n(a11, zVar2.j())) {
                    qVar = q.RIGHT_WORD;
                } else if (i1.a.n(a11, zVar2.k())) {
                    qVar = q.PREV_PARAGRAPH;
                } else if (i1.a.n(a11, zVar2.h())) {
                    qVar = q.NEXT_PARAGRAPH;
                } else if (i1.a.n(a11, zVar2.m())) {
                    qVar = q.DELETE_PREV_CHAR;
                } else if (i1.a.n(a11, zVar2.g())) {
                    qVar = q.DELETE_NEXT_WORD;
                } else if (i1.a.n(a11, zVar2.c())) {
                    qVar = q.DELETE_PREV_WORD;
                } else if (i1.a.n(a11, zVar2.b())) {
                    qVar = q.DESELECT;
                }
            } else if (i1.d.f(keyEvent)) {
                long a12 = i1.d.a(keyEvent);
                z zVar3 = z.f8641a;
                if (i1.a.n(a12, zVar3.p())) {
                    qVar = q.SELECT_LINE_LEFT;
                } else if (i1.a.n(a12, zVar3.o())) {
                    qVar = q.SELECT_LINE_RIGHT;
                }
            } else if (i1.d.d(keyEvent)) {
                long a13 = i1.d.a(keyEvent);
                z zVar4 = z.f8641a;
                if (i1.a.n(a13, zVar4.c())) {
                    qVar = q.DELETE_FROM_LINE_START;
                } else if (i1.a.n(a13, zVar4.g())) {
                    qVar = q.DELETE_TO_LINE_END;
                }
            }
            if (qVar == null) {
                return this.f8571a.a(keyEvent);
            }
            return qVar;
        }
    }

    public static final s a(pc.l<? super i1.b, Boolean> lVar) {
        qc.q.i(lVar, "shortcutModifier");
        return new a(lVar);
    }

    public static final s b() {
        return f8568a;
    }
}
