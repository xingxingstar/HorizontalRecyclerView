package com.example.zhuwojia.horizontalrecyclerview.bean;

import java.util.List;

/**
 * Created by zhuwojia on 2016/12/8.
 */

public class Display {

    /**
     * msg : OK
     * data : [{"published_at":1461586357,"repost_num":1101,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160425/b68be2d497f3576faa5590231caab8d4.jpg","post_id":402,"title":"wuli萌货来啦！","favorite_num":24,"url":"http://www.menghuoapp.com/post/402","favorite":0,"subtitle":""},{"published_at":1453219200,"repost_num":2191,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160119/15a9f0709eae8405ad4608928c4e6e3e.png","post_id":401,"title":"阿萌搬家啦~","favorite_num":52,"url":"http://www.menghuoapp.com/post/401","favorite":0,"subtitle":"萌货app搬家公告"},{"published_at":1453206600,"repost_num":1128,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160108/ecc58fcfc24f3604a4d426574f129687.jpg","post_id":396,"title":"喵星人杯具萌萌哒~","favorite_num":77,"url":"http://www.menghuoapp.com/post/396","favorite":0,"subtitle":"猫咪主题杯子"},{"published_at":1453120200,"repost_num":831,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160108/9c90de3b9d1c57bea227ea322ca1cd4d.jpg","post_id":397,"title":"让抹茶系治愈躁动不安的你","favorite_num":79,"url":"http://www.menghuoapp.com/post/397","favorite":0,"subtitle":"抹茶味零食"},{"published_at":1453033800,"repost_num":366,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160112/02b80639d6f4f6b19fec5083266be7b9.jpg","post_id":399,"title":"姆明一族万岁！","favorite_num":28,"url":"http://www.menghuoapp.com/post/399","favorite":0,"subtitle":"姆明亚美周边精选"},{"published_at":1452947400,"repost_num":290,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160109/6304d63a0e6cdd7560396ce14ade4ce6.jpg","post_id":398,"title":"跟着\u201c太子妃\u201d选口红！","favorite_num":32,"url":"http://www.menghuoapp.com/post/398","favorite":0,"subtitle":"太子妃升职记同款口红特辑"},{"published_at":1452861000,"repost_num":349,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160114/c1f2babec34c52ebc909cf7c6163cf13.jpg","post_id":400,"title":"把美好装满瓶瓶罐罐","favorite_num":74,"url":"http://www.menghuoapp.com/post/400","favorite":0,"subtitle":"玻璃罐收纳特辑"},{"published_at":1452774600,"repost_num":226,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160107/d146f835a878e0bb22494a4be8b5ca16.jpg","post_id":395,"title":"猴年开运大法","favorite_num":15,"url":"http://www.menghuoapp.com/post/395","favorite":0,"subtitle":"新年红转运特辑"},{"published_at":1452688200,"repost_num":295,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160107/0351490adf5a8935acccfd366b2b848b.jpg","post_id":394,"title":"小公主的小勺子","favorite_num":58,"url":"http://www.menghuoapp.com/post/394","favorite":0,"subtitle":"唯美勺子特辑"},{"published_at":1452601800,"repost_num":266,"pic_url":"http://7xiuft.com1.z0.glb.clouddn.com/20160106/487f39072400bf090c903eb6fdf79ff3.jpg","post_id":393,"title":"没钱，也要买包包！","favorite_num":47,"url":"http://www.menghuoapp.com/post/393","favorite":0,"subtitle":"白菜价萌包推荐"}]
     * code : 0
     */

    private String msg;
    private int code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * published_at : 1461586357
         * repost_num : 1101
         * pic_url : http://7xiuft.com1.z0.glb.clouddn.com/20160425/b68be2d497f3576faa5590231caab8d4.jpg
         * post_id : 402
         * title : wuli萌货来啦！
         * favorite_num : 24
         * url : http://www.menghuoapp.com/post/402
         * favorite : 0
         * subtitle :
         */

        private int published_at;
        private int repost_num;
        private String pic_url;
        private int post_id;
        private String title;
        private int favorite_num;
        private String url;
        private int favorite;
        private String subtitle;

        public int getPublished_at() {
            return published_at;
        }

        public void setPublished_at(int published_at) {
            this.published_at = published_at;
        }

        public int getRepost_num() {
            return repost_num;
        }

        public void setRepost_num(int repost_num) {
            this.repost_num = repost_num;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public int getPost_id() {
            return post_id;
        }

        public void setPost_id(int post_id) {
            this.post_id = post_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getFavorite_num() {
            return favorite_num;
        }

        public void setFavorite_num(int favorite_num) {
            this.favorite_num = favorite_num;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getFavorite() {
            return favorite;
        }

        public void setFavorite(int favorite) {
            this.favorite = favorite;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }
    }
}
