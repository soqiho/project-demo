/**
 * 
 */
package com.liebao.lb7881.test;

/**
 * @author pan
 *
 */
public class CardManageDaoTest extends BaseTest {

	/*@Autowired
	private CardManageDao cardManageDao;
	@Autowired
	private CardSecretDao cardSecretDao;
*/
	/**
	 * 获取卡密
	 *//*
	@Test
	public void takeCardSecret() {
		
		 * * CardSecretRequest CardSecretResponse
		  
		CardManage cardManage = new CardManage();
		cardManage.setUserid("21111111111111111111111111111111");// 用户id
		cardManage.setGameid("31111111111111111111111111111111");// 游戏id
		cardManage.setCarriersId("51111111111111111111111111111111");// 运营商id
		cardManage.setCardChannel(2);// 卡渠道：0 ，1 ios，2 豌豆荚
		cardManage.setZoneId("811111111");// 区id
		cardManage.setServiceId("811111112");// 服务id
		cardManage.setCardFaceValue("1000金币");// 面值
		List<CardManage> cardManages = cardManageDao.selectCardManagesByParams(cardManage);
		if(cardManages.size()>0){
			if(cardManages.size()==1){
				System.out.println("cardId:---" + cardManages.get(0).getId());
			}
		}
		CardSecret cardSecret = new CardSecret();
		cardSecret.setCardManageId(cardManages.get(0).getId());
		String cardsecrets = JSON.toJSONString(cardSecretDao.selectByEntityWhere(cardSecret));

		System.out.println("cardsecrets:---" + cardsecrets);
	}

	*//**
	 * 改卡密状态 <br>
	 *//*
	@Test
	public void modifyCardSecretStatus() {
		
		 * * cardNo:卡号 status:卡密状态 1:未使用 2:已使用 3:异常 4:已分配 boolean
		  
		CardSecret cardSecret = new CardSecret();
		cardSecret.setCardNo("6275654612555698969");
		cardSecret.setStatus(1);
		List<CardSecret> cardSecret2 = cardSecretDao.selectByEntityWhere(cardSecret);
		String id = "";
		if(cardSecret2.size()>0){
			id =cardSecret2.get(0).getCardManageId();
		}
		CardManage cardManage = new CardManage();
		cardManage.setId(id);
		cardManage.setStatus(2);//已上架
		cardManage.setSellCount(800);
		cardManage.setSellPrice(40.00);
		String booleans = JSON.toJSONString(cardManageDao.updateByIdSelective(cardManage));
		System.out.println("cardId:---" + booleans);//0失败 1成功
	}*/

}
