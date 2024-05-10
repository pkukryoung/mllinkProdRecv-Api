package kdjsystem.mllink.dto.order;

public class ShopOrderMstDto {

        private String userid;

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        private String dosinOrder_code;

        public String getDosinOrder_code() {
            return dosinOrder_code;
        }

        public void setDosinOrder_code(String dosinOrder_code) {
            this.dosinOrder_code = dosinOrder_code;
        }

        private String delvcode;
        private String delvurl;
        private String authkey1;
        private String authKey2;
        private String vendorId;
        private String dlvid;
        private String url;
        private String passwd;
        private String expid;
        private String dlvnm;
        private String ordimg;
        private String p_sku_id;
        private String csClose;
        private String domeOrderId;
        private String domemall;

        public String getDomemall() {
            return domemall;
        }

        public void setDomemall(String domemall) {
            this.domemall = domemall;
        }

        public String getNonSync() {
            return nonSync;
        }

        public void setNonSync(String nonSync) {
            this.nonSync = nonSync;
        }

        private String nonSync;


        // 카톡발송으로인한 임시변수
        private String msg;
        private String telno;
        private String shopseq;
        // 통계자료
        private String shopnm;
        private String goods_cost;
        private String commmis;
        private String compare;
        private String total_wonamt;
        private String profit;
        private String ret_cnt;
        private String ret_cost;
        private String cnc_cnt;
        private String cnc_cost;
        private String ord_cnt;
        private String naverexpcode;
        private String processdate;
        private String currentlocation;
        private String delvstatus;
        private String delvnm;
        private String dosinstatus;
        private String dosinoption;
        private String suppstditem;
        private String suppstdrati;
        private String suppcostitem;
        private String suppcostrati;
        private String ds_order_status;
        private String del_yn;
        private String dsdelv_cost;
        private String dsGoods_cost;
        private String dsdelv_type;
        private String dsdelv_qty;
        private String nickname;
        private String nickname2;
        private String orddt;

        private String seq;
        private String expnm;
        private String invno;
        private String moveseq;
        private String sabordno;
        private String P_sku_value2;
        private String senddate;

        private String mlorddt;
        private String mlordseq;
        private String mlseq;


        public String getNickname2() {
            return nickname2;
        }

        public void setNickname2(String nickname2) {
            this.nickname2 = nickname2;
        }

        public String getMlorddt() {
            return mlorddt;
        }

        public void setMlorddt(String mlorddt) {
            this.mlorddt = mlorddt;
        }

        public String getMlordseq() {
            return mlordseq;
        }

        public void setMlordseq(String mlordseq) {
            this.mlordseq = mlordseq;
        }

        public String getDomeOrderId() {
            return domeOrderId;
        }

        public void setDomeOrderId(String domeOrderId) {
            this.domeOrderId = domeOrderId;
        }

        public String getMlseq() {
            return mlseq;
        }

        public void setMlseq(String mlseq) {
            this.mlseq = mlseq;
        }

        public String getSenddate() {
            return senddate;
        }

        public void setSenddate(String senddate) {
            this.senddate = senddate;
        }

        public String getP_sku_value2() {
            return P_sku_value2;
        }

        public void setP_sku_value2(String p_sku_value2) {
            P_sku_value2 = p_sku_value2;
        }

        public String getSabordno() {
            return sabordno;
        }

        public void setSabordno(String sabordno) {
            this.sabordno = sabordno;
        }

        public String getMoveseq() {
            return moveseq;
        }

        public void setMoveseq(String moveseq) {
            this.moveseq = moveseq;
        }

        public String getOrddt() {
            return orddt;
        }

        public void setOrddt(String orddt) {
            this.orddt = orddt;
        }

        public String getSeq() {
            return seq;
        }

        public void setSeq(String seq) {
            this.seq = seq;
        }

        public String getExpnm() {
            return expnm;
        }

        public void setExpnm(String expnm) {
            this.expnm = expnm;
        }

        public String getInvno() {
            return invno;
        }

        public void setInvno(String invno) {
            this.invno = invno;
        }

        public String getDsdelv_cost() {
            return dsdelv_cost;
        }

        public void setDsdelv_cost(String dsdelv_cost) {
            this.dsdelv_cost = dsdelv_cost;
        }

        public String getDsGoods_cost() {
            return dsGoods_cost;
        }

        public void setDsGoods_cost(String dsGoods_cost) {
            this.dsGoods_cost = dsGoods_cost;
        }

        public String getDsdelv_type() {
            return dsdelv_type;
        }

        public void setDsdelv_type(String dsdelv_type) {
            this.dsdelv_type = dsdelv_type;
        }

        public String getDsdelv_qty() {
            return dsdelv_qty;
        }

        public void setDsdelv_qty(String dsdelv_qty) {
            this.dsdelv_qty = dsdelv_qty;
        }

        private String mall_exp_cd;

        /*
         * 승인자 거절
         */
        public boolean getDel_yn() {
            return ("".concat(del_yn).toUpperCase().equals("Y"));
        }

        public String getMall_exp_cd() {
            return mall_exp_cd;
        }

        public void setMall_exp_cd(String mall_exp_cd) {
            this.mall_exp_cd = mall_exp_cd;
        }

        public void setDel_yn(String del_yn) {
            this.del_yn = del_yn;
        }

        public String getDs_order_status() {
            return ds_order_status;
        }

        public void setDs_order_status(String ds_order_status) {
            this.ds_order_status = ds_order_status;


        }

        public String getSuppstditem() {
            return suppstditem;
        }

        public void setSuppstditem(String suppstditem) {
            this.suppstditem = suppstditem;
        }

        public String getSuppstdrati() {
            return suppstdrati;
        }

        public void setSuppstdrati(String suppstdrati) {
            this.suppstdrati = suppstdrati;
        }

        public String getSuppcostitem() {
            return suppcostitem;
        }

        public void setSuppcostitem(String suppcostitem) {
            this.suppcostitem = suppcostitem;
        }

        public String getSuppcostrati() {
            return suppcostrati;
        }

        public void setSuppcostrati(String suppcostrati) {
            this.suppcostrati = suppcostrati;
        }

        public String getDosinoption() {
            return dosinoption;
        }

        public void setDosinoption(String dosinoption) {
            this.dosinoption = dosinoption;
        }

        public String getDosinstatus() {
            return dosinstatus;
        }

        public void setDosinstatus(String dosinstatus) {
            this.dosinstatus = dosinstatus;
        }

        public String getDelvcode() {
            return delvcode;
        }

        public void setDelvcode(String delvcode) {
            this.delvcode = delvcode;
        }

        public String getDelvurl() {
            return delvurl;
        }

        public void setDelvurl(String delvurl) {
            this.delvurl = delvurl;
        }

        public String getDelvnm() {
            return delvnm;
        }

        public void setDelvnm(String delvnm) {
            this.delvnm = delvnm;
        }

        public String getNaverexpcode() {
            return naverexpcode;
        }

        public void setNaverexpcode(String naverexpcode) {
            this.naverexpcode = naverexpcode;
        }

        public String getProcessdate() {
            return processdate;
        }

        public void setProcessdate(String processdate) {
            this.processdate = processdate;
        }

        public String getCurrentlocation() {
            return currentlocation;
        }

        public void setCurrentlocation(String currentlocation) {
            this.currentlocation = currentlocation;
        }

        public String getDelvstatus() {
            return delvstatus;
        }

        public void setDelvstatus(String delvstatus) {
            this.delvstatus = delvstatus;
        }

        public String getOrd_cnt() {
            return ord_cnt;
        }

        public void setOrd_cnt(String ord_cnt) {
            this.ord_cnt = ord_cnt;
        }

        public String getRet_cnt() {
            return ret_cnt;
        }

        public void setRet_cnt(String ret_cnt) {
            this.ret_cnt = ret_cnt;
        }

        public String getRet_cost() {
            return ret_cost;
        }

        public void setRet_cost(String ret_cost) {
            this.ret_cost = ret_cost;
        }

        public String getCnc_cnt() {
            return cnc_cnt;
        }

        public void setCnc_cnt(String cnc_cnt) {
            this.cnc_cnt = cnc_cnt;
        }

        public String getCnc_cost() {
            return cnc_cost;
        }

        public void setCnc_cost(String cnc_cost) {
            this.cnc_cost = cnc_cost;
        }

        public String getShopnm() {
            return shopnm;
        }

        public void setShopnm(String shopnm) {
            this.shopnm = shopnm;
        }

        public String getGoods_cost() {
            return goods_cost;
        }

        public void setGoods_cost(String goods_cost) {
            this.goods_cost = goods_cost;
        }

        public String getCommmis() {
            return commmis;
        }

        public void setCommmis(String commmis) {
            this.commmis = commmis;
        }

        public String getCompare() {
            return compare;
        }

        public void setCompare(String compare) {
            this.compare = compare;
        }

        public String getTotal_wonamt() {
            return total_wonamt;
        }

        public void setTotal_wonamt(String total_wonamt) {
            this.total_wonamt = total_wonamt;
        }

        public String getProfit() {
            return profit;
        }

        public void setProfit(String profit) {
            this.profit = profit;
        }

        public String getReceive_detail() {
            return receive_detail;
        }

        public void setReceive_detail(String receive_detail) {
            this.receive_detail = receive_detail;
        }

        public String getShopseq() {
            return shopseq;
        }

        public void setShopseq(String shopseq) {
            this.shopseq = shopseq;
        }

        public String getDlvnm() {
            return dlvnm;
        }

        public void setDlvnm(String dlvnm) {
            this.dlvnm = dlvnm;
        }

        public String getP_sku_id() {
            return p_sku_id;
        }

        public void setP_sku_id(String p_sku_id) {
            this.p_sku_id = p_sku_id;
        }

        public String getCsClose() {
            return csClose;
        }

        public void setCsClose(String csClose) {
            this.csClose = csClose;
        }

        private String receiptid;

        private String exchangeid;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getTelno() {
            return telno;
        }

        public void setTelno(String telno) {
            this.telno = telno;
        }

        public String getReceiptid() {
            return receiptid;
        }

        public String getExpid() {
            return expid;
        }

        public void setExpid(String expid) {
            this.expid = expid;
        }

        public String getDlvid() {
            return dlvid;
        }

        public void setDlvid(String dlvid) {
            this.dlvid = dlvid;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPasswd() {
            return passwd;
        }

        public void setPasswd(String passwd) {
            this.passwd = passwd;
        }

        public void setReceiptid(String receiptid) {
            this.receiptid = receiptid;
        }

        public String getExchangeid() {
            return exchangeid;
        }

        public void setExchangeid(String exchangeid) {
            this.exchangeid = exchangeid;
        }

        public String getVendorId() {
            return vendorId;
        }

        public void setVendorId(String vendorId) {
            this.vendorId = vendorId;
        }

        public String getAuthkey1() {
            return authkey1;
        }

        public void setAuthkey1(String authkey1) {
            this.authkey1 = authkey1;
        }

        public String getAuthKey2() {
            return authKey2;
        }

        public void setAuthKey2(String authKey2) {
            this.authKey2 = authKey2;
        }

        private String startDt;
        private String endDt;

        public String getStartDt() {
            return startDt;
        }

        public void setStartDt(String startDt) {
            this.startDt = startDt;
        }

        public String getEndDt() {
            return endDt;
        }

        public void setEndDt(String endDt) {
            this.endDt = endDt;
        }

        private String shopPw;

        private String no;

        public String getNo() {
            return no;
        }

        public String getShopPw() {
            return shopPw;
        }

        public void setShopPw(String shopPw) {
            this.shopPw = shopPw;
        }

        public void setNo(String no) {
            this.no = no;
        }

        private String result_code;
        private String result_text;

        public String getResult_code() {
            return result_code;
        }

        public void setResult_code(String result_code) {
            this.result_code = result_code;
        }

        public String getResult_text() {
            return result_text;
        }

        public void setResult_text(String result_text) {
            this.result_text = result_text;
        }

        private String ordseq;
        private String compno; //

        private String reg_date;

        private String order_id;
        private String shopid;
        private String shop_userid;
        private String order_status;

        private String user_id;

        private String user_name;

        private String user_tel;
        private String user_cel;

        private String user_email;

        private String receive_tel;

        private String receive_cel;
        private String receive_email;
        private String delv_msg;
        private String receive_name;

        private String receive_zipcode;

        private String receive_addr;

        private String receive_detail;

        private String total_cost;

        private String pay_cost;

        private String order_date;

        private String request_date;

        private String partner_id;
        private String dpartner_id;
        private String mall_product_id;

        private String product_id;
        private String sku_id;

        private String p_product_name;

        private String p_sku_value;

        private String product_name;

        private String sale_cost;
        private String mall_won_cost;

        private String won_cost;
        private String sku_value;

        private String sale_cnt;

        private String delivery_method_str;

        private String delv_cost;
        private String compayny_goods_cd;
        private String sku_alias;
        private String box_ea;
        private String jung_chk_yn;

        private String bmDlvCst;


        public String getBmDlvCst() {
            return bmDlvCst;
        }

        public void setBmDlvCst(String bmDlvCst) {
            this.bmDlvCst = bmDlvCst;
        }

        private String mall_order_seq;

        private String mall_order_id;

        private String etc_field3;

        private String order_gubun;

        private String p_ea;

        private String ord_field2;

        private String copy_idx;
        private String goods_nm_pr;
        private String goods_keyword;

        private String ord_confirm_date;
        private String rtn_dt;
        private String chng_dt;
        private String delivery_confirm_date;
        private String cancel_dt;
        private String class_cd1;
        private String class_cd2;
        private String class_cd3;
        private String class_cd4;
        private String brand_nm;
        private String delivery_id;
        private String invoice_no;
        private String hope_delv_date;
        private String fld_dsp;
        private String inv_send_msg;
        private String model_no;
        private String set_gubun;
        private String etc_msg;

        private String delv_msg1;
        private String mul_delv_msg;
        private String barcode;
        private String inv_send_dm;
        private String delivery_method_str2; // 11번가 배송비 유형(01:선불,02:착부르03:무료)
        private String order_etc_1;

        private String order_etc_2; //
        private String order_etc_3; //
        private String order_etc_4; //
        private String order_etc_5; //
        private String order_etc_6; //
        private String order_etc_7; //
        private String order_etc_8; //
        private String order_etc_9; //
        private String order_etc_10; //
        private String order_etc_11; //
        private String order_etc_12; //
        private String copyYN;

        public String getCopyYN() {
            return copyYN;
        }

        public void setCopyYN(String copyYN) {
            this.copyYN = copyYN;
        }

        //	@XmlElement(name = "clmReqSeq" )
        private String order_etc_13; // 11번가 교환시 크레임 번호-->이동-->Exchageid

        //	@XmlElement(name = "ordPrdCnSeq" )
        private String order_etc_14; // 11번가 취소,반품시 크레임 번호-->이동-->Receiptid
        private String label;
        private String apikey;

        public String getApikey() {
            return apikey;
        }

        public void setApikey(String apikey) {
            this.apikey = apikey;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getOrdseq() {
            return ordseq;
        }

        public void setOrdseq(String ordseq) {
            this.ordseq = ordseq;
        }

        public String getCompno() {
            return compno;
        }

        public void setCompno(String compno) {
            this.compno = compno;
        }

        public String getReg_date() {
            return reg_date;
        }

        public void setReg_date(String reg_date) {
            this.reg_date = reg_date;
        }

        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }

        public String getShopid() {
            return shopid;
        }

        public void setShopid(String shopid) {
            this.shopid = shopid;
        }

        public String getShop_userid() {
            return shop_userid;
        }

        public void setShop_userid(String shop_userid) {
            this.shop_userid = shop_userid;
        }

        public String getOrder_status() {
            return order_status;
        }

        public void setOrder_status(String order_status) {
            this.order_status = order_status;

        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getUser_tel() {
            return user_tel;
        }

        public void setUser_tel(String user_tel) {
            this.user_tel = user_tel;
        }

        public String getUser_cel() {
            return user_cel;
        }

        public void setUser_cel(String user_cel) {
            this.user_cel = user_cel;
        }

        public String getUser_email() {
            return user_email;
        }

        public void setUser_email(String user_email) {
            this.user_email = user_email;
        }

        public String getReceive_tel() {
            return receive_tel;
        }

        public void setReceive_tel(String receive_tel) {
            this.receive_tel = receive_tel;
        }

        public String getReceive_cel() {
            return receive_cel;
        }

        public void setReceive_cel(String receive_cel) {
            this.receive_cel = receive_cel;
        }

        public String getReceive_email() {
            return receive_email;
        }

        public void setReceive_email(String receive_email) {
            this.receive_email = receive_email;
        }

        public String getDelv_msg() {
            return delv_msg;
        }

        public void setDelv_msg(String delv_msg) {
            this.delv_msg = delv_msg;
        }

        public String getReceive_name() {
            return receive_name;
        }

        public void setReceive_name(String receive_name) {
            this.receive_name = receive_name;
        }

        public String getReceive_zipcode() {
            return receive_zipcode;
        }

        public void setReceive_zipcode(String receive_zipcode) {
            this.receive_zipcode = receive_zipcode;
        }

        public String getReceive_addr() {
            return receive_addr;
        }

        public void setReceive_addr(String receive_addr) {
            this.receive_addr = receive_addr;
        }

        public String getTotal_cost() {
            return total_cost;
        }

        public void setTotal_cost(String total_cost) {
            this.total_cost = total_cost;
        }

        public String getPay_cost() {
            return pay_cost;
        }

        public void setPay_cost(String pay_cost) {
            this.pay_cost = pay_cost;
        }

        public String getOrder_date() {
            return order_date;
        }

        public void setOrder_date(String order_date) {
            this.order_date = order_date;
        }

        public String getRequest_date() {
            return request_date;
        }

        public void setRequest_date(String request_date) {
            this.request_date = request_date;
        }

        public String getPartner_id() {
            return partner_id;
        }

        public void setPartner_id(String partner_id) {
            this.partner_id = partner_id;
        }

        public String getDpartner_id() {
            return dpartner_id;
        }

        public void setDpartner_id(String dpartner_id) {
            this.dpartner_id = dpartner_id;
        }

        public String getMall_product_id() {
            return mall_product_id;
        }

        public void setMall_product_id(String mall_product_id) {
            this.mall_product_id = mall_product_id;
        }

        public String getProduct_id() {
            return product_id;
        }

        public void setProduct_id(String product_id) {
            this.product_id = product_id;
        }

        public String getSku_id() {
            return sku_id;
        }

        public void setSku_id(String sku_id) {
            this.sku_id = sku_id;
        }

        public String getP_product_name() {
            return p_product_name;
        }

        public void setP_product_name(String p_product_name) {
            if (p_product_name == null)
                return;

            if (p_product_name.contains("[복사본]")) {
                setCopyYN("Y");
            } else {
                setCopyYN("N");
            }
            this.p_product_name = p_product_name;
        }

        public String getP_sku_value() {
            return p_sku_value;
        }

        public void setP_sku_value(String p_sku_value) {
            this.p_sku_value = p_sku_value;
        }

        public String getProduct_name() {
            return product_name;
        }

        public void setProduct_name(String product_name) {
            this.product_name = product_name;
        }

        public String getSale_cost() {
            return sale_cost;
        }

        public void setSale_cost(String sale_cost) {
            this.sale_cost = sale_cost;
        }

        public String getMall_won_cost() {
            return mall_won_cost;
        }

        public void setMall_won_cost(String mall_won_cost) {
            this.mall_won_cost = mall_won_cost;
        }

        public String getWon_cost() {
            return won_cost;
        }

        public void setWon_cost(String won_cost) {
            this.won_cost = won_cost;
        }

        public String getSku_value() {
            return sku_value;
        }

        public void setSku_value(String sku_value) {
            this.sku_value = sku_value;
        }

        public String getSale_cnt() {
            return sale_cnt;
        }

        public void setSale_cnt(String sale_cnt) {
            this.sale_cnt = sale_cnt;
        }

        public String getDelivery_method_str() {
            return delivery_method_str;
        }

        public void setDelivery_method_str(String delivery_method_str) {
            this.delivery_method_str = delivery_method_str;
        }

        public String getDelv_cost() {
            return delv_cost;
        }

        public void setDelv_cost(String delv_cost) {
            this.delv_cost = delv_cost;
        }

        public String getCompayny_goods_cd() {
            return compayny_goods_cd;
        }

        public void setCompayny_goods_cd(String compayny_goods_cd) {

            this.compayny_goods_cd = compayny_goods_cd;
        }

        public String getSku_alias() {
            return sku_alias;
        }

        public void setSku_alias(String sku_alias) {
            this.sku_alias = sku_alias;
        }

        public String getBox_ea() {
            return box_ea;
        }

        public void setBox_ea(String box_ea) {
            this.box_ea = box_ea;
        }

        public String getJung_chk_yn() {
            return jung_chk_yn;
        }

        public void setJung_chk_yn(String jung_chk_yn) {
            this.jung_chk_yn = jung_chk_yn;
        }

        public String getMall_order_seq() {
            return mall_order_seq;
        }

        public void setMall_order_seq(String mall_order_seq) {
            this.mall_order_seq = mall_order_seq;
        }

        public String getMall_order_id() {
            return mall_order_id;
        }

        public void setMall_order_id(String mall_order_id) {
            this.mall_order_id = mall_order_id;
        }

        public String getEtc_field3() {
            return etc_field3;
        }

        public void setEtc_field3(String etc_field3) {
            this.etc_field3 = etc_field3;
        }

        public String getOrder_gubun() {
            return order_gubun;
        }

        public void setOrder_gubun(String order_gubun) {
            this.order_gubun = order_gubun;
        }

        public String getP_ea() {
            return p_ea;
        }

        public void setP_ea(String p_ea) {
            this.p_ea = p_ea;
        }

        public String getOrd_field2() {
            return ord_field2;
        }

        public void setOrd_field2(String ord_field2) {
            this.ord_field2 = ord_field2;
        }

        public String getCopy_idx() {
            return copy_idx;
        }

        public void setCopy_idx(String copy_idx) {
            this.copy_idx = copy_idx;
        }

        public String getGoods_nm_pr() {
            return goods_nm_pr;
        }

        public void setGoods_nm_pr(String goods_nm_pr) {
            this.goods_nm_pr = goods_nm_pr;
        }

        public String getGoods_keyword() {
            return goods_keyword;
        }

        public void setGoods_keyword(String goods_keyword) {
            if (goods_keyword != null && !goods_keyword.equals("")) {
                switch (goods_keyword) {
                    case "shop0286":
                        setDomemall("펀앤쇼핑");
                        break;
                    case "shop0120":
                        setDomemall("오너클랜");
                        break;
                    case "shop0283":
                        setDomemall("도매의신");
                        break;
                    case "shop9994":
                        setDomemall("3MRO");
                        break;
                    case "shop0316":
                        setDomemall("투비즈온");
                        break;
                    case "shop9992":
                        setDomemall("W트레이딩");
                        break;
                    case "shop0319":
                        setDomemall("도매꾹");
                        break;
                    case "shop9995":
                        setDomemall("젠트레이드");
                        break;
                    case "shop5001":
                        setDomemall("허브셀러");
                        break;
                    case "shop7777":
                        setDomemall("셀몰");
                        break;
                    default:
                        setDomemall("자체몰");
                        break;
                }
            } else {
                setDomemall("");
            }
            this.goods_keyword = goods_keyword;
        }

        public String getOrd_confirm_date() {
            return ord_confirm_date;
        }

        public void setOrd_confirm_date(String ord_confirm_date) {
            this.ord_confirm_date = ord_confirm_date;
        }

        public String getRtn_dt() {
            return rtn_dt;
        }

        public void setRtn_dt(String rtn_dt) {
            this.rtn_dt = rtn_dt;
        }

        public String getChng_dt() {
            return chng_dt;
        }

        public void setChng_dt(String chng_dt) {
            this.chng_dt = chng_dt;
        }

        public String getDelivery_confirm_date() {
            return delivery_confirm_date;
        }

        public void setDelivery_confirm_date(String delivery_confirm_date) {
            this.delivery_confirm_date = delivery_confirm_date;
        }

        public String getCancel_dt() {
            return cancel_dt;
        }

        public void setCancel_dt(String cancel_dt) {
            this.cancel_dt = cancel_dt;
        }

        public String getClass_cd1() {
            return class_cd1;
        }

        public void setClass_cd1(String class_cd1) {
            this.class_cd1 = class_cd1;
        }

        public String getClass_cd2() {
            return class_cd2;
        }

        public void setClass_cd2(String class_cd2) {
            this.class_cd2 = class_cd2;
        }

        public String getClass_cd3() {
            return class_cd3;
        }

        public void setClass_cd3(String class_cd3) {
            this.class_cd3 = class_cd3;
        }

        public String getClass_cd4() {
            return class_cd4;
        }

        public void setClass_cd4(String class_cd4) {
            this.class_cd4 = class_cd4;
        }

        public String getBrand_nm() {
            return brand_nm;
        }

        public void setBrand_nm(String brand_nm) {
            this.brand_nm = brand_nm;
        }

        public String getDelivery_id() {
            return delivery_id;
        }

        public void setDelivery_id(String delivery_id) {
            this.delivery_id = delivery_id;
        }

        public String getInvoice_no() {
            return invoice_no;
        }

        public void setInvoice_no(String invoice_no) {
            this.invoice_no = invoice_no;
        }

        public String getHope_delv_date() {
            return hope_delv_date;
        }

        public void setHope_delv_date(String hope_delv_date) {
            this.hope_delv_date = hope_delv_date;
        }

        public String getFld_dsp() {
            return fld_dsp;
        }

        public void setFld_dsp(String fld_dsp) {
            this.fld_dsp = fld_dsp;
        }

        public String getInv_send_msg() {
            return inv_send_msg;
        }

        public void setInv_send_msg(String inv_send_msg) {
            this.inv_send_msg = inv_send_msg;
        }

        public String getModel_no() {
            return model_no;
        }

        public void setModel_no(String model_no) {
            this.model_no = model_no;
        }

        public String getSet_gubun() {
            return set_gubun;
        }

        public void setSet_gubun(String set_gubun) {
            this.set_gubun = set_gubun;
        }

        public String getEtc_msg() {
            return etc_msg;
        }

        public void setEtc_msg(String etc_msg) {
            this.etc_msg = etc_msg;
        }

        public String getDelv_msg1() {
            return delv_msg1;
        }

        public void setDelv_msg1(String delv_msg1) {
            this.delv_msg1 = delv_msg1;
        }

        public String getMul_delv_msg() {
            return mul_delv_msg;
        }

        public void setMul_delv_msg(String mul_delv_msg) {
            this.mul_delv_msg = mul_delv_msg;
        }

        public String getBarcode() {
            return barcode;
        }

        public void setBarcode(String barcode) {
            this.barcode = barcode;
        }

        public String getInv_send_dm() {
            return inv_send_dm;
        }

        public void setInv_send_dm(String inv_send_dm) {
            this.inv_send_dm = inv_send_dm;
        }

        public String getDelivery_method_str2() {
            return delivery_method_str2;
        }

        public void setDelivery_method_str2(String delivery_method_str2) {
            this.delivery_method_str2 = delivery_method_str2;
        }

        public String getOrder_etc_1() {
            return order_etc_1;
        }

        public void setOrder_etc_1(String order_etc_1) {
            this.order_etc_1 = order_etc_1;
        }

        public String getOrder_etc_2() {
            return order_etc_2;
        }

        public void setOrder_etc_2(String order_etc_2) {
            this.order_etc_2 = order_etc_2;
        }

        public String getOrder_etc_3() {
            return order_etc_3;
        }

        public void setOrder_etc_3(String order_etc_3) {
            this.order_etc_3 = order_etc_3;
        }

        public String getOrder_etc_4() {
            return order_etc_4;
        }

        public void setOrder_etc_4(String order_etc_4) {
            this.order_etc_4 = order_etc_4;
        }

        public String getOrder_etc_5() {
            return order_etc_5;
        }

        public void setOrder_etc_5(String order_etc_5) {
            this.order_etc_5 = order_etc_5;
        }

        public String getOrder_etc_6() {
            return order_etc_6;
        }

        public void setOrder_etc_6(String order_etc_6) {
            this.order_etc_6 = order_etc_6;
        }

        public String getOrder_etc_7() {
            return order_etc_7;
        }

        public void setOrder_etc_7(String order_etc_7) {
            this.order_etc_7 = order_etc_7;
        }

        public String getOrder_etc_8() {
            return order_etc_8;
        }

        public void setOrder_etc_8(String order_etc_8) {
            this.order_etc_8 = order_etc_8;
        }

        public String getOrder_etc_9() {
            return order_etc_9;
        }

        public void setOrder_etc_9(String order_etc_9) {
            this.order_etc_9 = order_etc_9;
        }

        public String getOrder_etc_10() {
            return order_etc_10;
        }

        public void setOrder_etc_10(String order_etc_10) {
            this.order_etc_10 = order_etc_10;
        }

        public String getOrder_etc_11() {
            return order_etc_11;
        }

        public void setOrder_etc_11(String order_etc_11) {
            this.order_etc_11 = order_etc_11;
        }

        public String getOrder_etc_12() {
            return order_etc_12;
        }

        public void setOrder_etc_12(String order_etc_12) {
            this.order_etc_12 = order_etc_12;
        }

        public String getOrder_etc_13() {
            return order_etc_13;
        }

        public void setOrder_etc_13(String order_etc_13) {
            this.order_etc_13 = order_etc_13;
        }

        public String getOrder_etc_14() {
            return order_etc_14;
        }

        public void setOrder_etc_14(String order_etc_14) {
            this.order_etc_14 = order_etc_14;
        }


        public String getOrdimg() {
            return ordimg;
        }

        public void setOrdimg(String ordimg) {
            this.ordimg = ordimg;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getShoplotte() {
            // TODO Auto-generated method stub
            return null;
        }

}
