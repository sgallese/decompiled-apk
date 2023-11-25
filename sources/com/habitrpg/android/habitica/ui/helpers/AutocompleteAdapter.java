package com.habitrpg.android.habitica.ui.helpers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.extensions.ViewGroupExt;
import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.models.social.FindUsernameResult;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.helpers.EmojiMap;
import com.habitrpg.common.habitica.helpers.EmojiParser;
import ec.b0;
import ec.u;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import qc.h;
import qc.q;
import yc.v;
import yc.w;
import yc.y;

/* compiled from: AutocompleteAdapter.kt */
/* loaded from: classes4.dex */
public final class AutocompleteAdapter extends BaseAdapter implements Filterable {
    public static final int $stable = 8;
    private String autocompleteContext;
    private List<? extends ChatMessage> chatMessages;
    private final Context context;
    private List<String> emojiResults;
    private String groupID;
    private boolean isAutocompletingUsers;
    private long lastAutocomplete;
    private final boolean remoteAutocomplete;
    private final SocialRepository socialRepository;
    private List<FindUsernameResult> userResults;

    public /* synthetic */ AutocompleteAdapter(Context context, SocialRepository socialRepository, String str, String str2, boolean z10, int i10, h hVar) {
        this(context, (i10 & 2) != 0 ? null : socialRepository, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? false : z10);
    }

    public final String getAutocompleteContext() {
        return this.autocompleteContext;
    }

    public final List<ChatMessage> getChatMessages() {
        return this.chatMessages;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list;
        if (this.isAutocompletingUsers) {
            list = this.userResults;
        } else {
            list = this.emojiResults;
        }
        return list.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new Filter() { // from class: com.habitrpg.android.habitica.ui.helpers.AutocompleteAdapter$getFilter$1
            @Override // android.widget.Filter
            protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                boolean z10;
                List list;
                List list2;
                boolean D0;
                int s10;
                List list3;
                List list4;
                LocalAuthentication localAuthentication;
                boolean z11;
                String V0;
                long j10;
                List list5;
                List list6;
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (charSequence != null && charSequence.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    if (charSequence.charAt(0) == '@' && charSequence.length() >= 3 && AutocompleteAdapter.this.getSocialRepository() != null && AutocompleteAdapter.this.getRemoteAutocomplete()) {
                        long time = new Date().getTime();
                        j10 = AutocompleteAdapter.this.lastAutocomplete;
                        if (time - j10 <= 2000) {
                            list5 = AutocompleteAdapter.this.userResults;
                            filterResults.values = list5;
                            list6 = AutocompleteAdapter.this.userResults;
                            filterResults.count = list6.size();
                        } else {
                            AutocompleteAdapter.this.lastAutocomplete = new Date().getTime();
                            AutocompleteAdapter.this.userResults = new ArrayList();
                            AutocompleteAdapter.this.isAutocompletingUsers = true;
                        }
                    } else if (charSequence.charAt(0) == '@') {
                        AutocompleteAdapter.this.lastAutocomplete = new Date().getTime();
                        AutocompleteAdapter.this.isAutocompletingUsers = true;
                        AutocompleteAdapter autocompleteAdapter = AutocompleteAdapter.this;
                        List<ChatMessage> chatMessages = autocompleteAdapter.getChatMessages();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : chatMessages) {
                            if (((ChatMessage) obj).isValid()) {
                                arrayList.add(obj);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (hashSet.add(((ChatMessage) obj2).getUsername())) {
                                arrayList2.add(obj2);
                            }
                        }
                        ArrayList<ChatMessage> arrayList3 = new ArrayList();
                        for (Object obj3 : arrayList2) {
                            String username = ((ChatMessage) obj3).getUsername();
                            if (username != null) {
                                V0 = y.V0(charSequence.toString(), 1);
                                z11 = v.F(username, V0, false, 2, null);
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                arrayList3.add(obj3);
                            }
                        }
                        s10 = u.s(arrayList3, 10);
                        ArrayList arrayList4 = new ArrayList(s10);
                        for (ChatMessage chatMessage : arrayList3) {
                            FindUsernameResult findUsernameResult = new FindUsernameResult();
                            findUsernameResult.setAuthentication(new Authentication());
                            Authentication authentication = findUsernameResult.getAuthentication();
                            if (authentication != null) {
                                authentication.setLocalAuthentication(new LocalAuthentication());
                            }
                            Authentication authentication2 = findUsernameResult.getAuthentication();
                            if (authentication2 != null) {
                                localAuthentication = authentication2.getLocalAuthentication();
                            } else {
                                localAuthentication = null;
                            }
                            if (localAuthentication != null) {
                                localAuthentication.setUsername(chatMessage.getUsername());
                            }
                            findUsernameResult.setContributor(chatMessage.getContributor());
                            findUsernameResult.setProfile(new Profile());
                            Profile profile = findUsernameResult.getProfile();
                            if (profile != null) {
                                profile.setName(chatMessage.getUser());
                            }
                            arrayList4.add(findUsernameResult);
                        }
                        autocompleteAdapter.userResults = arrayList4;
                        list3 = AutocompleteAdapter.this.userResults;
                        filterResults.values = list3;
                        list4 = AutocompleteAdapter.this.userResults;
                        filterResults.count = list4.size();
                    } else if (charSequence.charAt(0) == ':') {
                        AutocompleteAdapter.this.isAutocompletingUsers = false;
                        AutocompleteAdapter autocompleteAdapter2 = AutocompleteAdapter.this;
                        Set<String> keySet = EmojiMap.invertedEmojiMap.keySet();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : keySet) {
                            String str = (String) obj4;
                            q.f(str);
                            D0 = w.D0(str, charSequence, false, 2, null);
                            if (D0) {
                                arrayList5.add(obj4);
                            }
                        }
                        autocompleteAdapter2.emojiResults = arrayList5;
                        list = AutocompleteAdapter.this.emojiResults;
                        filterResults.values = list;
                        list2 = AutocompleteAdapter.this.emojiResults;
                        filterResults.count = list2.size();
                    }
                }
                return filterResults;
            }

            @Override // android.widget.Filter
            protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                if (filterResults != null && filterResults.count > 0) {
                    AutocompleteAdapter.this.notifyDataSetChanged();
                } else {
                    AutocompleteAdapter.this.notifyDataSetInvalidated();
                }
            }
        };
    }

    public final String getGroupID() {
        return this.groupID;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        List list;
        Object d02;
        if (this.isAutocompletingUsers) {
            list = this.userResults;
        } else {
            list = this.emojiResults;
        }
        d02 = b0.d0(list, i10);
        return d02;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        int i11;
        Object item = getItem(i10);
        if (item != null) {
            i11 = item.hashCode();
        } else {
            i11 = 0;
        }
        return i11;
    }

    public final boolean getRemoteAutocomplete() {
        return this.remoteAutocomplete;
    }

    public final SocialRepository getSocialRepository() {
        return this.socialRepository;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2;
        String str;
        TextView textView;
        FindUsernameResult findUsernameResult;
        UsernameLabel usernameLabel;
        TextView textView2;
        ContributorInfo contributor;
        String str2;
        Profile profile;
        int i11 = 0;
        TextView textView3 = null;
        String str3 = null;
        if (this.isAutocompletingUsers) {
            if (viewGroup != null) {
                view2 = ViewGroupExt.inflate$default(viewGroup, R.layout.autocomplete_username, false, 2, null);
            } else {
                view2 = null;
            }
            Object item = getItem(i10);
            if (item instanceof FindUsernameResult) {
                findUsernameResult = (FindUsernameResult) item;
            } else {
                findUsernameResult = null;
            }
            if (view2 != null) {
                usernameLabel = (UsernameLabel) view2.findViewById(R.id.display_name_view);
            } else {
                usernameLabel = null;
            }
            if (usernameLabel != null) {
                if (findUsernameResult != null && (profile = findUsernameResult.getProfile()) != null) {
                    str2 = profile.getName();
                } else {
                    str2 = null;
                }
                usernameLabel.setUsername(str2);
            }
            if (usernameLabel != null) {
                if (findUsernameResult != null && (contributor = findUsernameResult.getContributor()) != null) {
                    i11 = contributor.getLevel();
                }
                usernameLabel.setTier(i11);
            }
            if (view2 != null) {
                textView2 = (TextView) view2.findViewById(R.id.username_view);
            } else {
                textView2 = null;
            }
            if (textView2 != null) {
                if (findUsernameResult != null) {
                    str3 = findUsernameResult.getFormattedUsername();
                }
                textView2.setText(str3);
            }
        } else {
            if (viewGroup != null) {
                view2 = ViewGroupExt.inflate$default(viewGroup, R.layout.autocomplete_emoji, false, 2, null);
            } else {
                view2 = null;
            }
            Object item2 = getItem(i10);
            if (item2 instanceof String) {
                str = (String) item2;
            } else {
                str = null;
            }
            if (view2 != null) {
                textView = (TextView) view2.findViewById(R.id.emoji_textview);
            } else {
                textView = null;
            }
            if (textView != null) {
                textView.setText(EmojiParser.INSTANCE.parseEmojis(str));
            }
            if (view2 != null) {
                textView3 = (TextView) view2.findViewById(R.id.label);
            }
            if (textView3 != null) {
                textView3.setText(str);
            }
        }
        if (view2 == null) {
            return new View(this.context);
        }
        return view2;
    }

    public final void setAutocompleteContext(String str) {
        this.autocompleteContext = str;
    }

    public final void setChatMessages(List<? extends ChatMessage> list) {
        q.i(list, "<set-?>");
        this.chatMessages = list;
    }

    public final void setGroupID(String str) {
        this.groupID = str;
    }

    public AutocompleteAdapter(Context context, SocialRepository socialRepository, String str, String str2, boolean z10) {
        q.i(context, "context");
        this.context = context;
        this.socialRepository = socialRepository;
        this.autocompleteContext = str;
        this.groupID = str2;
        this.remoteAutocomplete = z10;
        this.chatMessages = new ArrayList();
        this.userResults = new ArrayList();
        this.emojiResults = new ArrayList();
        this.isAutocompletingUsers = true;
    }
}
